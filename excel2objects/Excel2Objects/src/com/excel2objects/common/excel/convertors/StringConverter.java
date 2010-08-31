package com.excel2objects.common.excel.convertors;

import com.excel2objects.common.excel.exceptions.UnparsbleException;

public class StringConverter implements Converter<String> {

	public String fromString(String value) {
		return value;
	}

	@Override
	public String from(Object input) throws UnparsbleException {
		if (input instanceof String)
			return this.fromString((String) input);
		return null;
	}

}
