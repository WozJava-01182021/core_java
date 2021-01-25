package com.rukshanu.handson7;

public class Manager extends Employee {
	String jobTitle;
	
	
	Manager(){
		firstName = "";
		lastName = "";
		companyName = "";
		yearsAtCompany = 0;
		jobTitle = "";
	}
	Manager(String firstName, String lastName, String companyName, int yearsAtCompany, String jobTitle){
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.yearsAtCompany = yearsAtCompany;
		this.jobTitle = jobTitle;
	}
	
	public String getJobTitle() { return jobTitle; }
	public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
	
	@Override
	public String toString() {
		String str = String.format("%s %s has worked at %s for %s year(s) as a(n) %s.", firstName, lastName, companyName, yearsAtCompany, jobTitle);
		return str;
	}


}
