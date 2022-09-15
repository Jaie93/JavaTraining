package com.yash.exception7;

public class ChainingException extends Exception {
	public ChainingException(Exception e) {
		super(e);
	}

}
