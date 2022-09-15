package StreamApiAssignments;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Student {

	int rollno;
	LocalDateTime date_of_addmission,dob;
	int maths, physics, chemistry, English, hindi; // marks in subjects
	String classname;
	
		
		public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}
	
	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	
	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}
	
	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, int maths, int physics,
			int chemistry, int english, int hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}
	public double calculate(Student s)
	{
		 double sum,per,avg;
		 sum = s.chemistry+s.English+s.hindi+s.maths+s.physics;
		 avg = sum/500;
		 per = avg *100;
		 return per;
		
	}
	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(11,LocalDateTime.of(2019, 02, 28, 14, 33, 48, 640000),LocalDateTime.of(1996, 07, 24, 14, 33, 48, 650000),55,67,78,86,82,"first"));
		students.add(new Student(12,LocalDateTime.of(2020, 04, 12, 15, 32, 48, 650000),LocalDateTime.of(1997, 11, 22, 14, 33, 48, 650000),56,17,27,16,82,"second"));
		students.add(new Student(13,LocalDateTime.of(2021, 12, 16, 17, 31, 48, 660000),LocalDateTime.of(1998, 12, 21, 14, 33, 48, 650000),78,69,76,84,85,"first"));
		students.add(new Student(14,LocalDateTime.of(2017, 11, 19, 16, 38, 48, 610000),LocalDateTime.of(1999, 06, 25, 14, 33, 48, 650000),18,12,77,20,89,"third"));
		students.add(new Student(15,LocalDateTime.of(2018, 01, 20, 11, 33, 48, 600000),LocalDateTime.of(2000, 05, 27, 14, 33, 48, 650000),98,60,79,97,68,"fourth"));
		
		System.out.println("----------students who scored less than 40%----------");
		students.stream().filter(s->s.calculate(s)<40).forEach(s->System.out.println("Roll no:"+s.getRollno()+" classname:"+s.getClassname()));
		System.out.println("----------students who scored more than 75%----------");
		students.stream().filter(s->s.calculate(s)>75).forEach(s->System.out.println("Roll no:"+s.getRollno()+" classname:"+s.getClassname()));
		List<Student> list1 = students.stream().filter(s->s.English<40||s.chemistry<40||s.hindi<40||s.maths<40||s.physics<40).collect(Collectors.toList());
		System.out.println("--------students who fail in at least one subject-----------");
		for(Student s:list1)
		{
			System.out.println(s.rollno+"--------"+s.classname);
		}
		Long count = students.stream().filter(s->s.calculate(s)>40).count();
		System.out.println("---------no of students who promoted to next class--------"+count);
	}

}
