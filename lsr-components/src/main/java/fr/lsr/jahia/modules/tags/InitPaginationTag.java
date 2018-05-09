package fr.lsr.jahia.modules.tags;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;

import fr.lsr.jahia.modules.utils.Constants;

/**
 * @author BENAGIBA
 */
public class InitPaginationTag extends TagSupport {
	/**
	 * Serial ID
	 */
	private static final long serialVersionUID = 2721470089955685795L;
	private final transient static Logger LOGGER = org.slf4j.LoggerFactory.getLogger(InitPaginationTag.class);
	private int pageSize;
	private int count;
	private int maxPages;
	private String countSessionAttr;
	private static final int TEN = 10;
	private static final int MAX_PAGES_TO_NOT_SHOW_DECADE = 50;

	@Override
	public int doStartTag() throws JspException {
		int currentPage = 0;
		String sPage = pageContext.getRequest().getParameter(Constants.PARAMS_PAGINATION);
		try {
			Integer.valueOf(sPage);
		} catch (Exception NumberFormatException) {
			/* tentative de xss? */
			sPage = "1";
		}

		if (sPage != null) {
			try {
				currentPage = Integer.valueOf(sPage);
			} catch (NumberFormatException e) {
				LOGGER.error(e.getMessage(), e);
			}
		}

		if (StringUtils.isNotBlank(countSessionAttr)) {
			// Recuperer le count stocke dans la session
			Object sessoinCount = pageContext.getSession().getAttribute(countSessionAttr);
			if (sessoinCount != null) {
				try {
					count = (int) sessoinCount;
				} catch (Exception e) {
					LOGGER.error(e.getMessage(), e);
				}
			}
			// Ajouter le count dans la session
			pageContext.getSession().setAttribute(countSessionAttr, count);
		}

		if (pageSize == 0) {
			pageSize = 1;
		}

		int nbPages = (int) (count / pageSize);
		if (nbPages * pageSize < count) {
			nbPages++;
		}
		if (maxPages > 0 && nbPages > maxPages) {
			nbPages = maxPages;
		}

		if (currentPage == 0) {
			currentPage = 1;
		} else if (currentPage > nbPages) {
			currentPage = (int) nbPages;
		}

		// calculer la liste des pages
		List<Integer> pagesList = new ArrayList<Integer>();
		pagesList.add(1);
		if (nbPages <= 10) {
			addSteps(pagesList, 1, 1, nbPages);
		} else {
			if (currentPage < 10) {
				addSteps(pagesList, 1, 1, TEN);
				addSteps(pagesList, TEN, TEN, nbPages > MAX_PAGES_TO_NOT_SHOW_DECADE ? MAX_PAGES_TO_NOT_SHOW_DECADE : nbPages);
			} else {
				int r = ((int) (currentPage / TEN)) * TEN;
				pagesList.add(TEN);
				addSteps(pagesList, TEN, TEN, r);
				if (r + 9 < nbPages) {
					addSteps(pagesList, r, 1, r + TEN);
					addSteps(pagesList, r + TEN, TEN, nbPages > MAX_PAGES_TO_NOT_SHOW_DECADE ? MAX_PAGES_TO_NOT_SHOW_DECADE : nbPages);
				} else {
					addSteps(pagesList, r, 1, nbPages);
				}
			}
		}

		@SuppressWarnings("unchecked")
		Map<String, Object> paginationMap = (HashMap<String, Object>) pageContext.getRequest().getAttribute("paginationMap");
		if (paginationMap == null) {
			paginationMap = new HashMap<String, Object>();
			pageContext.getRequest().setAttribute("paginationMap", paginationMap);
		}

		paginationMap.put("pagesList", pagesList);
		paginationMap.put("nbOfPages", nbPages);
		paginationMap.put("selectedPage", currentPage);
		paginationMap.put("PARAMS_PAGINATION", Constants.PARAMS_PAGINATION);
		return super.doStartTag();
	}

	private void addSteps(List<Integer> pagesList, int start, int step, int max) {
		for (int i = start + step; i <= max; i = i + step) {
			pagesList.add(i);
		}
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
		count = 0;
		maxPages = 0;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMaxPages() {
		return maxPages;
	}

	public void setMaxPages(int maxPages) {
		this.maxPages = maxPages;
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
