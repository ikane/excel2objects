package com.excel2objects.common.excel.convertors;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.excel2objects.common.excel.exceptions.UnparsbleException;

public class DateConverter implements Converter<Date> {

	private DateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");

	public DateConverter() {
	}

	public DateConverter(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	public DateConverter(String dateFormat) {
		this.dateFormat = new SimpleDateFormat(dateFormat);
	}

	public DateFormat getDateFormat() {
		return this.dateFormat;
	}

	public void setDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Override
	public Date from(Object value) throws UnparsbleException {
		try {
			if (value instanceof String)
				return this.dateFormat.parse((String) value);
		} catch (final ParseException e) {
			throw new UnparsbleException(e);
		}
		return null;
	}

}
