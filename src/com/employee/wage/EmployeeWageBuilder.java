package com.employee.wage;


public class EmployeeWageBuilder {

	public static void main(String[] args) {
		final int PRESENT = 1;
		final int PART_TIME = 2;
		final int FULL_TIME = 8;
		final int WAGE_PER_HOUR = 20;
		final int MAX_WORKING_DAYS = 20;
		final int MAX_WORKING_HOUR = 60;

		int totalWorkingHour = 0;
		int day = 0;
		while (day < MAX_WORKING_DAYS && totalWorkingHour < MAX_WORKING_HOUR) {
			day++;
			int isEmpPresent = 0;
			if (totalWorkingHour == MAX_WORKING_HOUR - (FULL_TIME / 2)) {
				isEmpPresent = PART_TIME;
			} else {
				isEmpPresent = (int) (Math.random() * 3);
			}
			int empHr;

			// System.out.println(isEmpPresent);

			switch (isEmpPresent) {

			case PRESENT:
				// System.out.println("Employee is present");
				empHr = FULL_TIME;
				break;

			case PART_TIME:
				// System.out.println("Employee is working part-time");
				empHr = FULL_TIME / 2;
				break;

			default:
				// System.out.println("Employee is absent");
				empHr = 0;
				break;

			}

			totalWorkingHour = totalWorkingHour + empHr;
		}
		int totalSalary = totalWorkingHour * WAGE_PER_HOUR;
		System.out.println("Employee monthly salary : $" + totalSalary + " USD");
		System.out.println("Working Hour : " + totalWorkingHour + " Hour");
	}

}