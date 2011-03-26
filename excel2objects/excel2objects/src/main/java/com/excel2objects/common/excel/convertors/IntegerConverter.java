package com.excel2objects.common.excel.convertors;

import com.excel2objects.common.excel.exceptions.UnparsbleException;

public class IntegerConverter implements Converter<Integer> {

	public Integer fromString(String value) {
		if (value == null || value.length() == 0)
			return 0;
		return Integer.parseInt(value);
	}

	@Override
	public Integer from(Object input) throws UnparsbleException {
		if (input instanceof String)
			return this.fromString((String) input);
		return null;
	}

}
