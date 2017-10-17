package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {

	ArrayList<Staff> Staff = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 60000.0, new Date(1980,1,1), eTitle.MR));
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 40000.0, new Date(1980,1,1), eTitle.MR));
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 20000.0, new Date(1980,1,1), eTitle.MR));
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 55000.0, new Date(1980,1,1), eTitle.MR));
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 10000.0, new Date(1980,1,1), eTitle.MR));
	assertTrue((Staff.get(0).getSalary()+Staff.get(1).getSalary()+Staff.get(2).getSalary()+
			Staff.get(3).getSalary()+Staff.get(4).getSalary())/5 == 37000.0);
	}
	@Test (expected = PersonException.class)
	public void test2() throws PersonException{
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1960,1,1), "110 Fake Lane", "302-1234-567",
				"email@email.email", "4-6", 5 , 10000.0, new Date(1980,1,1), eTitle.MR));
	}
	@Test (expected = PersonException.class)
	public void test3() throws PersonException{
		Staff.add(new Staff("FirstName", "MiddleName", "LastName", new Date(1905,1,1), "110 Fake Lane", "(302) 123-4567",
				"email@email.email", "4-6", 5 , 10000.0, new Date(1980,1,1), eTitle.MR));
	}
}
