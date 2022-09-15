package com.yash;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch;
		List<Student> students = new ArrayList<>();
		List<Teacher> teachers = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int numOfStudents = 3,numOfTeachers=3,i=0,j=0;
		while(i<numOfStudents)
		{
			System.out.println("Enter student details (rollNo,name,grade)");
			int rollNo = sc.nextInt();
			String name = sc.next();
			int grade = sc.nextInt();
			students.add(new Student(rollNo,name,grade));
			i++;
		}
		System.out.println("---------Studets in school--------");
		students.stream().forEach(System.out::println);
		while(j<numOfTeachers)
		{
			System.out.println("Enter Teacher details(id,name,salary)");
			int id = sc.nextInt();
			String name = sc.next();
			int salary = sc.nextInt();
			teachers.add(new Teacher(id,name,salary));
			j++;
		}
		System.out.println("---------Teachers in school--------");
		teachers.stream().forEach(System.out::println);
		School abhinav = new School(teachers,students);
		System.out.println("Enter student name who want to pay fees and amount of fees he want to pay");
		String sname = sc.next();
		int fees = sc.nextInt();
		students.stream().filter(s->s.getName().equalsIgnoreCase(sname)).findFirst().get().payFees(fees);
		System.out.println("total Money earned:"+abhinav.getTotalMoneyEarned());
		System.out.println("-----making school pay salary------");
		System.out.println("Enter teacher's name who salary to be paid and amount of salary");
		String tname = sc.next();
		int sal = sc.nextInt();
		teachers.stream().filter(s->s.getName().equalsIgnoreCase(tname)).findFirst().get().receiveSalary(sal);
		System.out.println("---------Teachers after receiving salary in school--------");
		teachers.stream().forEach(System.out::println);		
		//System.out.println(saket);
		
	}

}
