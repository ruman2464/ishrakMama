package com.bit.test;

public class BaseTest {
	
	String studentNAme;
	int id;
	String DOB;
	String major;
	Double GPA;
	
	BaseTest (String StudentName, int id, String DOB, String major, Double Gpa){
		this.studentNAme=StudentName;
		this.id=id;
		this.DOB=DOB;
		this.major=major;
		this.GPA=Gpa;
		System.out.println("Firstname: "+StudentName+"\nid: "+id+"\nDoB: "+DOB);
		
	}
    
	
	

}
