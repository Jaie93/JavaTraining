package com.yash.exception7;

public class ExceptionChaining {

	public static void test() throws ChainingException {
		try {
			System.out.println("try start");
			int a = 0;
			int b = 1;
			System.out.println(b / a);
			System.out.println("try end");
		} catch (Exception e) {
			throw new ChainingException(e);
		}
	}

	public static void main(String[] args) {
		try {
			test();
		} catch (ChainingException e) {

			System.out.println(e.getMessage());
		}
	}
}