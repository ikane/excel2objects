package com.excel2objects.common.excel.exceptions;

public class UnparsbleException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 428566647890426963L;

	public UnparsbleException(String msg) {
		super(msg);
	}

	public UnparsbleException(Exception e) {
		super(e);
	}

}
