package fr.lsr.jahia.modules.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 * @author BEN AJIBA
 */
public class LsrUtils {
	private static Logger LOGGER = Logger.getLogger(LsrUtils.class);

	public static List<Long> valueOf(String[] values) {
		if (values != null && values.length > 0) {
			List<Long> toReturn = new ArrayList<>(values.length);
			for (String val : values) {
				if (StringUtils.isNotBlank(val)) {
					toReturn.add(valueOf(val));
				}

			}
			return toReturn;
		}
		return null;
	}

	public static Long valueOf(String val) {
		try {
			if (StringUtils.isNotBlank(val)) {
				return Long.valueOf(val);
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		return null;
	}
}