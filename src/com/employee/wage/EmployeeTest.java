package com.employee.wage;

import java.util.LinkedList;

public class EmployeeTest {

//	CompanyEmpWage[] companies;
	LinkedList<CompanyEmpWage> companiesEmps;
//	int lastIndex;

	public EmployeeTest() {
//		companies = new CompanyEmpWage[10];
		companiesEmps = new LinkedList<CompanyEmpWage>();
	}

	public void addCompany(String companyName, int fullTimeWorkingHour, int wagePerHour,
			int maxWorkingDay, int maxWorkingHour) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName,
				fullTimeWorkingHour, wagePerHour, maxWorkingDay, maxWorkingHour);
		companyEmpWage.calculateEmployeeWage();
//		companies[lastIndex] = companyEmpWage;
		companiesEmps.add(companyEmpWage);
//		lastIndex++;
	}

	public void printAllCompanies() {
//		for (int i = 0; i < companies.length; i++) {
		for (int i = 0; i < companiesEmps.size(); i++) {
//			if (companies[i] != null) {
			System.out.println(companiesEmps.get(i));
			System.out.println("<------------------------->");
//			}
		}
	}

	public static void main(String[] args) {
		EmployeeTest testObj = new EmployeeTest();

		testObj.addCompany("DMart", 8, 20, 20, 60);
		testObj.addCompany("Reliance", 10, 25, 22, 80);
		testObj.addCompany("Wipro", 8, 25, 20, 80);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("DMart", 8, 20, 20, 60);
		testObj.addCompany("Reliance", 10, 25, 22, 80);
		testObj.addCompany("Wipro", 8, 25, 20, 80);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Tesla", 12, 40, 25, 100);

		testObj.printAllCompanies();

		System.out.println("Size of the list : " + testObj.companiesEmps.size());
	}

}