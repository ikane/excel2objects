package com.excel2objects.common.excel.convertors;

import com.excel2objects.common.excel.exceptions.UnparsbleException;

public interface Converter<T> {

	T from(Object input) throws UnparsbleException;
}
