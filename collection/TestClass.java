package com.yash.collection;

import java.util.Collections;
import java.util.Vector;

public class TestClass {

	public static void main(String[] args) {

		Vector<Student> student = new Vector<>();

		student.add(new Student("Jaie", 86, 1));
		student.add(new Student("Kedar", 96, 2));
		student.add(new Student("Priya", 99, 4));
		student.add(new Student("Sunidhi", 100, 9));
		student.add(new Student("Tanmay", 88, 34));

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

		System.out.println();

		Collections.sort(student);

		for (Student s : student)

			System.out.println("Name:" + s.name + "->" + "Marks:" + s.marks + "->" + "ID:" + s.id);

	}

}
