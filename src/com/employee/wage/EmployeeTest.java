package com.employee.wage;

public class EmployeeTest {

	CompanyEmpWage[] companies;
	int lastIndex;

	public EmployeeTest() {
		companies = new CompanyEmpWage[100];
	}

	public void addCompany(String companyName, int fullTimeWorkingHour, int wagePerHour,
			int maxWorkingDay, int maxWorkingHour) {
		CompanyEmpWage companyEmpWage = new CompanyEmpWage(companyName,
				fullTimeWorkingHour, wagePerHour, maxWorkingDay, maxWorkingHour);
		companyEmpWage.calculateEmployeeWage();
		companies[lastIndex] = companyEmpWage;
		lastIndex++;
	}

	public void printAllCompanies() {
		for (int i = 0; i < companies.length; i++) {
			if (companies[i] != null) {
				System.out.println(companies[i]);
				System.out.println("<------------------------->");
			}
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

		testObj.printAllCompanies();
	}

}