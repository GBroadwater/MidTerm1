package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;
import com.cisc181.exceptions.PersonException;

public class Student_Test {
	static ArrayList<Course> Courses = new ArrayList<Course>();
	static ArrayList<Semester> Semesters = new ArrayList<Semester>();
	static ArrayList<Section> Sections = new ArrayList<Section>();
	static ArrayList<Student> Students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() throws PersonException {
		Courses.add(new Course(UUID.randomUUID(), "Introduction to Computers 2", 4, eMajor.COMPSI));
		Courses.add(new Course(UUID.randomUUID(), "Thermal Physics", 4, eMajor.PHYSICS));
		Courses.add(new Course(UUID.randomUUID(), "Introduction to Chemistry", 4, eMajor.CHEM));

		Semesters.add(new Semester(UUID.randomUUID(), new Date(2017, 9, 1), new Date(2017, 12, 1)));
		Semesters.add(new Semester(UUID.randomUUID(), new Date(2018, 2, 1), new Date(2018, 6, 1)));

		Sections.add(new Section(Courses.get(0).getCourseID(), Semesters.get(0).getSemesterID(), UUID.randomUUID(), 1));
		Sections.add(new Section(Courses.get(0).getCourseID(), Semesters.get(1).getSemesterID(), UUID.randomUUID(), 7));
		Sections.add(new Section(Courses.get(1).getCourseID(), Semesters.get(0).getSemesterID(), UUID.randomUUID(), 2));
		Sections.add(new Section(Courses.get(1).getCourseID(), Semesters.get(1).getSemesterID(), UUID.randomUUID(), 4));
		Sections.add(new Section(Courses.get(2).getCourseID(), Semesters.get(0).getSemesterID(), UUID.randomUUID(), 8));
		Sections.add(new Section(Courses.get(2).getCourseID(), Semesters.get(1).getSemesterID(), UUID.randomUUID(), 6));

		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
		Students.add(new Student("FirstName", "MiddleName", "LastName", new Date(1998, 1, 1), eMajor.COMPSI, "Address",
				"(302) 555-5555", "email"));
	}

	@Test
	public void test() {
		ArrayList<Enrollment> Enrollment = new ArrayList<Enrollment>();
		for (Student student : Students) {
			for (Section s : Sections) {
				Enrollment.add(new Enrollment(s.getSectionID(), student.getStudentID()));
			}
		}
		Enrollment.get(0).setGrade(3.2);
		Enrollment.get(1).setGrade(3.5);
		Enrollment.get(2).setGrade(3.7);
		Enrollment.get(3).setGrade(3.0);
		Enrollment.get(4).setGrade(3.1);
		Enrollment.get(5).setGrade(3.7);
		Enrollment.get(6).setGrade(3.4);
		Enrollment.get(7).setGrade(3.1);
		Enrollment.get(8).setGrade(2.1);
		Enrollment.get(9).setGrade(2.5);
		Enrollment.get(10).setGrade(3.4);
		Enrollment.get(11).setGrade(3.0);
		Enrollment.get(12).setGrade(4.0);
		Enrollment.get(13).setGrade(3.6);
		Enrollment.get(14).setGrade(3.1);
		Enrollment.get(15).setGrade(2.1);
		Enrollment.get(16).setGrade(2.8);
		Enrollment.get(17).setGrade(2.7);
		Enrollment.get(18).setGrade(3.5);
		Enrollment.get(19).setGrade(3.1);
		Enrollment.get(20).setGrade(2.9);
		Enrollment.get(21).setGrade(2.3);
		Enrollment.get(22).setGrade(4.0);
		Enrollment.get(23).setGrade(1.7);
		Enrollment.get(24).setGrade(3.4);
		Enrollment.get(25).setGrade(3.0);
		Enrollment.get(26).setGrade(3.8);
		Enrollment.get(27).setGrade(2.3);
		Enrollment.get(28).setGrade(2.7);
		Enrollment.get(29).setGrade(3.0);
		Enrollment.get(30).setGrade(2.4);
		Enrollment.get(31).setGrade(3.1);
		Enrollment.get(32).setGrade(3.3);
		Enrollment.get(33).setGrade(3.9);
		Enrollment.get(34).setGrade(3.1);
		Enrollment.get(35).setGrade(2.5);
		Enrollment.get(36).setGrade(3.5);
		Enrollment.get(37).setGrade(3.6);
		Enrollment.get(38).setGrade(2.7);
		Enrollment.get(39).setGrade(2.9);
		Enrollment.get(40).setGrade(3.1);
		Enrollment.get(41).setGrade(3.5);
		Enrollment.get(42).setGrade(3.0);
		Enrollment.get(43).setGrade(3.2);
		Enrollment.get(44).setGrade(3.8);
		Enrollment.get(45).setGrade(2.7);
		Enrollment.get(46).setGrade(4.0);
		Enrollment.get(47).setGrade(3.6);
		Enrollment.get(48).setGrade(3.1);
		Enrollment.get(49).setGrade(2.3);
		Enrollment.get(50).setGrade(2.7);
		Enrollment.get(51).setGrade(2.9);
		Enrollment.get(52).setGrade(3.0);
		Enrollment.get(53).setGrade(3.1);
		Enrollment.get(54).setGrade(1.5);
		Enrollment.get(55).setGrade(2.4);
		Enrollment.get(56).setGrade(3.6);
		Enrollment.get(57).setGrade(3.2);
		Enrollment.get(58).setGrade(2.1);
		Enrollment.get(59).setGrade(2.6);

		double GradeSum1 = 0;
		double GradeSum2 = 0;
		double GradeSum3 = 0;
		double GradeSum4 = 0;
		double GradeSum5 = 0;
		double GradeSum6 = 0;
		double GradeSum7 = 0;
		double GradeSum8 = 0;
		double GradeSum9 = 0;
		double GradeSum10 = 0;

		for (Enrollment e : Enrollment) {
			if (e.getStudentID() == Students.get(0).getStudentID())
				GradeSum1 += e.getGrade();
			if (e.getStudentID() == Students.get(1).getStudentID())
				GradeSum2 += e.getGrade();
			if (e.getStudentID() == Students.get(2).getStudentID())
				GradeSum3 += e.getGrade();
			if (e.getStudentID() == Students.get(3).getStudentID())
				GradeSum4 += e.getGrade();
			if (e.getStudentID() == Students.get(4).getStudentID())
				GradeSum5 += e.getGrade();
			if (e.getStudentID() == Students.get(5).getStudentID())
				GradeSum6 += e.getGrade();
			if (e.getStudentID() == Students.get(6).getStudentID())
				GradeSum7 += e.getGrade();
			if (e.getStudentID() == Students.get(7).getStudentID())
				GradeSum8 += e.getGrade();
			if (e.getStudentID() == Students.get(8).getStudentID())
				GradeSum9 += e.getGrade();
			if (e.getStudentID() == Students.get(9).getStudentID())
				GradeSum10 += e.getGrade();
		}
		GradeSum1 = ((double)((int)((GradeSum1/6)*100)))/100;
		assertTrue(3.36 == GradeSum1);
		
		GradeSum2 = ((double)((int)((GradeSum2/6)*100)))/100;
		assertTrue(2.91 == GradeSum2);
		
		GradeSum3 = ((double)((int)((GradeSum3/6)*100)))/100;
		assertTrue(3.04 == GradeSum3);
		
		GradeSum4 = ((double)((int)((GradeSum4/6)*100)))/100;
		assertTrue(2.91 == GradeSum4);
	
		GradeSum5 = ((double)((int)((GradeSum5/6)*100)))/100;
		assertTrue(3.03 == GradeSum5);
		
		GradeSum6 = ((double)((int)((GradeSum6/6)*100)))/100;
		assertTrue(3.05 == GradeSum6);
		
		GradeSum7 = ((double)((int)((GradeSum7/6)*100)))/100;
		assertTrue(3.21 == GradeSum7);
		
		GradeSum8 = ((double)((int)((GradeSum8/6)*100)))/100;
		assertTrue(3.38 == GradeSum8);
		
		GradeSum9 = ((double)((int)((GradeSum9/6)*100)))/100;
		assertTrue(2.85 == GradeSum9);
		
		GradeSum10 = ((double)((int)((GradeSum10/6)*100)))/100;
		assertTrue(2.56 == GradeSum10);
	
		double ClassSum1 = 0;
		double ClassSum2 = 0;
		double ClassSum3 = 0;
		double ClassSum4 = 0;
		double ClassSum5 = 0;
		double ClassSum6 = 0;
		
		for (Enrollment e : Enrollment) {
			if (e.getSectionID() == Sections.get(0).getSectionID())
				ClassSum1 += e.getGrade();
			if (e.getSectionID() == Sections.get(1).getSectionID())
				ClassSum2 += e.getGrade();
			if (e.getSectionID() == Sections.get(2).getSectionID())
				ClassSum3 += e.getGrade();
			if (e.getSectionID() == Sections.get(3).getSectionID())
				ClassSum4 += e.getGrade();
			if (e.getSectionID() == Sections.get(4).getSectionID())
				ClassSum5 += e.getGrade();
			if (e.getSectionID() == Sections.get(5).getSectionID())
				ClassSum6 += e.getGrade();
		}
		ClassSum1 = ((double)((int)(ClassSum1*10)))/100;
		assertTrue(3.1 == ClassSum1);
		
		ClassSum2 = ((double)((int)(ClassSum2*10)))/100;
		assertTrue(3.09 == ClassSum2);
		
		ClassSum3 = ((double)((int)(ClassSum3*10)))/100;
		assertTrue(3.17 == ClassSum3);
		
		ClassSum4 = ((double)((int)(ClassSum4*10)))/100;
		assertTrue(2.77 == ClassSum4);
	
		ClassSum5 = ((double)((int)(ClassSum5*10)))/100;
		assertTrue(3.13 == ClassSum5);
		
		ClassSum6 = ((double)((int)(ClassSum6*10)))/100;
		assertTrue(2.94 == ClassSum6);
	}	
}
