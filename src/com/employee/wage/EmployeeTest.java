package com.employee.wage;

import java.util.LinkedList;

public class EmployeeTest {

//	CompanyEmpWage[] companies;
	LinkedList<IComputeEmpWage> companiesEmps;
//	int lastIndex;

	public EmployeeTest() {
//		companies = new CompanyEmpWage[10];
		companiesEmps = new LinkedList<IComputeEmpWage>();
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
//			}
		}
	}

	public static void main(String[] args) {
		EmployeeTest testObj = new EmployeeTest();

		testObj.addCompany("DMart", 8, 20, 20, 60);
		testObj.addCompany("Reliance", 10, 25, 22, 80);
		testObj.addCompany("Wipro", 8, 25, 20, 80);
		testObj.addCompany("Tesla", 12, 40, 25, 100);
		testObj.addCompany("Amazon", 8, 50, 18, 50);
		testObj.addCompany("Google", 9, 40, 20, 50);
		testObj.addCompany("Infosys", 9, 30, 20, 80);
		testObj.addCompany("Facebook", 12, 40, 25, 100);
		testObj.addCompany("Oracle", 10, 25, 18, 60);

		testObj.printAllCompanies();

		System.out.println("---------------------------------");
		System.out.println("Size of the list : " + testObj.companiesEmps.size());

		System.out.println(
				"ICICI's emp salary : $" + testObj.getTotalSalary("icici") + " USD");
	}

	public double getTotalSalary(String companyName) {
		for (int i = 0; i < companiesEmps.size(); i++) {
			if (companiesEmps.get(i).getCompanyName().toLowerCase()
					.equals(companyName.toLowerCase())) {
				return companiesEmps.get(i).getTotalSalary();
			}
		}
		return 0;
	}

}