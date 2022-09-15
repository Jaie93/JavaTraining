package com.yash.traning.opps.homeAssignemnt.problem5;

public abstract class ClassB extends ClassA{
	
	@Override
	void sub(int a,int b) {
		int c=a-b;
		System.out.println("Sub Of 2 digit :"+c);
	}
	abstract void mul(int a, int b);
	abstract void div(int a,int b);
}	
