package fr.lsr.jahia.modules.tags;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;

import fr.lsr.jahia.modules.utils.Constants;

/**
 * @author BENAGIBA
 */
public class OffsetPaginationTag extends TagSupport {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 327711321614267748L;
	private final transient static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(OffsetPaginationTag.class);
	private int pageSize;
	private String countSessionAttr;

	@Override
	public int doStartTag() throws JspException {
		@SuppressWarnings("unchecked")
		Map<String, Object> paginationMap = (HashMap<String, Object>) pageContext.getRequest().getAttribute("paginationMap");
		if (paginationMap == null) {
			paginationMap = new HashMap<String, Object>();
			pageContext.getRequest().setAttribute("paginationMap", paginationMap);
		}

		int currentPage = 0;
		String sPage = pageContext.getRequest().getParameter(Constants.PARAMS_PAGINATION);
		if (sPage != null) {
			try {
				currentPage = Integer.valueOf(sPage);
			} catch (NumberFormatException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		if (currentPage == 0) {
			currentPage = 1;
		}

		if (pageSize == 0) {
			pageSize = 1;
		}

		int limit = 0;
		int offset = 0;
		int begin = 0;
		int end = 0;

		if (StringUtils.isNotBlank(countSessionAttr)) {
			if (pageContext.getSession().getAttribute(countSessionAttr) != null && currentPage > 1) {
				limit = pageSize;
				offset = (currentPage - 1) * pageSize;

				// Si le count est deja dans la session , on recupere les
				// donnees
				// avec une limit et offset, donc le begin = 0
				begin = 0;
				end = limit - 1;
			} else {
				// Si le count n'est pas present dans la session , on recupere
				// tous
				// les elements , donc il faut bien positionner le begin et le
				// end
				// en fonctionne de la page courante
				begin = (currentPage - 1) * pageSize;
				end = (currentPage * pageSize) - 1;

				pageContext.getSession().setAttribute(countSessionAttr, null);
			}
		} else {
			begin = (currentPage - 1) * pageSize;
			end = (currentPage * pageSize) - 1;
		}

		// request
		paginationMap.put("limit", limit);
		paginationMap.put("offset", offset);
		paginationMap.put("begin", begin);
		paginationMap.put("end", end);
		paginationMap.put("countSessionAttr", countSessionAttr);
		paginationMap.put("selectedPage", currentPage);

		return super.doStartTag();
	}

	@Override
	public int doEndTag() throws JspException {
		this.reset();
		return super.doEndTag();
	}

	@Override
	public void release() {
		super.release();
		this.reset();
	}

	private void reset() {
		pageSize = 0;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getCountSessionAttr() {
		return countSessionAttr;
	}

	public void setCountSessionAttr(String countSessionAttr) {
		this.countSessionAttr = countSessionAttr;
	}
}
