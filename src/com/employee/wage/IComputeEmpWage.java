package com.employee.wage;

public interface IComputeEmpWage {

	final int PRESENT = 1;
	final int PART_TIME = 2;

	public void calculateEmployeeWage();

	public double getTotalSalary();

	public String getCompanyName();
}