package com.lab;

import java.util.Scanner;

import com.lab.models.Employee;
import com.lab.services.CredentialsService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee("Manisha","Prasad");
		
		System.out.println("Please enter the department:\n"+
		"1.Technical\n"+
		"2.Admin\n"+
		"3.Human Resource\n"+
		"4.Legal");
		
		Scanner sc=new Scanner(System.in);
		int ob=sc.nextInt();
		String department;
		switch(ob) {
		case 1: 
			department="tech";
			break;
		case 2:
			department="adm";
			break;
		case 3:
			department="hr";
			break;
		case 4:
			department="lgl";
			break;
		default:
			throw new IllegalArgumentException("wrong input "+ob);

		}
		CredentialsService cs=new CredentialsService();
		String email=cs.generateEmailAddress(emp, department);
		String password=cs.generatePassword();
		cs.showCredentials(emp.getFirstName(), password, email);
		
	}

}
