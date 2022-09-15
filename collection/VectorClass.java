package com.yash.collection;

class Student implements Comparable<Student> {

	String name;
	int marks;
	int id;

	public Student(String name, int marks, int id) {

		this.name = name;
		this.marks = marks;
		this.id = id;
	}

	public int getMarks() {
		return this.marks;
	}

	public int compareTo(Student otherStudent) {

		return this.getMarks() - otherStudent.getMarks();
	}

}
