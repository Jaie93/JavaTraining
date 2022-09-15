package com.yash;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		this.totalMoneyEarned = 0;
		this.totalMoneySpent = 0;
	}
	public List<Teacher> getTeacher() {
		return teachers;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
	public List<Student> getStudent() {
		return students;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public void updateTotalMoneySpent(int moneySpent) {
		this.totalMoneyEarned -= moneySpent;
	}
	
		
}
