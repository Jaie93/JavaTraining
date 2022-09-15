package com.yash.traning.opps.homeAssignemnt.problem5;

public abstract class ClassA extends CalcAbs{

	@Override
	void sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum Of 2 digit : "+c);
		
	}
	abstract void sub(int a, int b);
	abstract void mul(int a, int b);
	abstract void div(int a,int b);
	/*
	 * @Override void sub(int a, int b) { int c=a-b;
	 * System.out.println("Sub Of 2 digit :"+c); }
	 * 
	 * @Override void mul(int a, int b) { int c=a*b;
	 * System.out.println("Mult Of 2 digit :"+c);
	 * 
	 * }
	 * 
	 * @Override void div(int a, int b) { int c=a/b;
	 * System.out.println("Div Of 2 digit :"+c); }
	 */
	

}
