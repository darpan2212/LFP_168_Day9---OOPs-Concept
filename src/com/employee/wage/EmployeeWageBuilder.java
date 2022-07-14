package com.employee.wage;

public class EmployeeWageBuilder {

	final int PRESENT = 1;
	final int PART_TIME = 2;
	/*
	 * final int FULL_TIME = 8; final int WAGE_PER_HOUR = 20; final int
	 * MAX_WORKING_DAYS = 20; final int MAX_WORKING_HOUR = 60;
	 */

	public int checkEmpAttendance(int totalWorkingHour, int fullTimeWorkingHour, int maxWorkingHour) {
		if (totalWorkingHour == maxWorkingHour - (fullTimeWorkingHour / 2)) {
			return PART_TIME;
		} else {
			return (int) (Math.random() * 3);
		}
	}

	public int getWorkingHour(int isEmpPresent, int fullTimeWorkingHour) {
		switch (isEmpPresent) {
		case PRESENT:
			// System.out.println("Employee is present");
			return fullTimeWorkingHour;

		case PART_TIME:
			// System.out.println("Employee is working part-time");
			return fullTimeWorkingHour / 2;

		default:
			// System.out.println("Employee is absent");
			return 0;
		}
	}

	public double calculateEmployeeWage(int fullTimeWorkingHour, int wagePerHour,
			int maxWorkingDay, int maxWorkingHour) {
		int totalWorkingHour = 0;
		int day = 0;
		while (day < maxWorkingDay && totalWorkingHour < maxWorkingHour) {
			day++;
			int isEmpPresent = checkEmpAttendance(totalWorkingHour, fullTimeWorkingHour, maxWorkingHour);

			int empHr = getWorkingHour(isEmpPresent, fullTimeWorkingHour);

			totalWorkingHour = totalWorkingHour + empHr;
		}
		System.out.println("Working Hour : " + totalWorkingHour + " Hour");
		return totalWorkingHour * wagePerHour;
	}

	public static void main(String[] args) {

		EmployeeWageBuilder builder = new EmployeeWageBuilder();

		double dMartEmpSalary = builder.calculateEmployeeWage(8, 20, 20, 60);
		System.out.println("Employee monthly salary : $" + dMartEmpSalary + " USD");

		double rilEmpSalary = builder.calculateEmployeeWage(9, 25, 22, 80);
		System.out.println("Employee monthly salary : $" + rilEmpSalary + " USD");
	}

}