package com.yash.exception1;

import java.util.Scanner;

public class Test {
	static int marks[];

	public static void main(String[] args) {

		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		String name = sc.next();
		System.out.println("Enter Roll No:");
		int rollNo = sc.nextInt();
		System.out.println("Enter Address:");
		String addr = sc.next();
		s1.setRollno(rollNo);
		s1.setSaddress(addr);
		s1.setSname(name);
		System.out.println("Enter the no of subjects:");
		int n = sc.nextInt();
		marks = new int[n];
		int fail = 0;
		try {
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the marks of Subject :" + (i + 1));
				int m = sc.nextInt();
				if (m < 0) {
					throw new NegativeMarksException("----Negative marks entered----");
				} else {
					marks[i] = m;
				}
				if (m < 40) {
					fail++;
				}
			}
		} catch (NegativeMarksException e) {
			System.out.println(e);
		}
		try {
			if (fail > 1) {
				throw new ResultException("---Student failed in more than one subject---");
			}
		} catch (ResultException e) {
			System.out.println(e);
		}

		sc.close();
	}
}