package com.rukshanu.handson7;

public class Employee {
	String firstName;
	String lastName;
	String companyName;
	protected int yearsAtCompany;
	
	Employee(){
		firstName = "";
		lastName = "";
		companyName = "";
		yearsAtCompany = 0;
	}
	Employee(String firstName, String lastName, String companyName, int yearsAtCompany){
		this.firstName = firstName;
		this.lastName = lastName;
		this.companyName = companyName;
		this.yearsAtCompany = yearsAtCompany;
	}
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName =firstName; }
	
	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	
	public String getCompanyName() { return companyName; }
	public void setCompanyName(String companyName) { this.companyName = companyName; }
	
	private int getYearsAtCompany() { return yearsAtCompany; }
	public void setYearsAtCompany(int yearsAtCompany) { this.yearsAtCompany = yearsAtCompany; }
	
	@Override
	public String toString() {
		String str = String.format("%s %s has worked at %s for %s year(s).", firstName, lastName, companyName, yearsAtCompany);
		return str;
	}
}
