package com.lab.services;

import java.util.Random;

import com.lab.models.Employee;

public class CredentialsService {
	
	private static final int password_length=8;

	public String generatePassword() {
		int first= (int) '!';//33
		int last= (int) '~';//126
		Random random = new Random();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<password_length;i++) {
			int randomNumber=random.nextInt(first,last);
			char randomChar=(char) randomNumber;
			sb.append(randomChar);
		}
		return sb.toString();
	
	}
	public String generateEmailAddress(Employee emp,String dep) {
		String email=String.format("%s%s@%s.company.com",emp.getFirstName(),emp.getLastname(),dep);
		return email;
	}
	//to display the credential-single responsibility method
	public void showCredentials(String firstName,String password,String email) {
		System.out.printf("Dear %s your generated credentials are as follow\n"
				+ "Email --> %s\n"
				+"Password --> %s",firstName,email,password);
	}
}
