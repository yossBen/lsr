package fr.lsr.jahia.modules.initializers;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.jahia.services.content.nodetypes.ExtendedPropertyDefinition;
import org.jahia.services.content.nodetypes.initializers.ChoiceListValue;
import org.jahia.services.content.nodetypes.initializers.ModuleChoiceListInitializer;

import com.mrted.ws.LovDescendantDto;

import fr.lsr.jahia.modules.services.impl.LovServiceImpl;
import fr.lsr.jahia.modules.utils.Lov;

/**
 * 
 * @author BEN AJIBA
 *
 */
public abstract class AbstractChoiceListLovsInitializers implements ModuleChoiceListInitializer {
	private String key;

	public List<ChoiceListValue> getChoiceListValues(ExtendedPropertyDefinition epd, String param, List<ChoiceListValue> values, Locale locale, Map<String, Object> context) {
		List<ChoiceListValue> vs = new ArrayList<ChoiceListValue>();
		List<LovDescendantDto> lovs = LovServiceImpl.getInstance().getLovs(getLov());
		if (CollectionUtils.isNotEmpty(lovs)) {
			for (LovDescendantDto lov : lovs) {
				vs.add(new ChoiceListValue(lov.getTranslation(), String.valueOf(lov.getLovId())));
			}
		}
		return vs;
	}

	public abstract Lov getLov();

	@Override
	public String getKey() {
		return key;
	}

	@Override
	public void setKey(String key) {
		this.key = key;
	}
}
