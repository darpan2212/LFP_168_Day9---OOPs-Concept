package com.employee.wage;

public class CompanyEmpWage implements IComputeEmpWage {

	private String companyName;
	private int fullTimeWorkingHour, wagePerHour, maxWorkingDay, maxWorkingHour;
	private double totalSalary;

	public CompanyEmpWage(String companyName, int fullTimeWorkingHour, int wagePerHour,
			int maxWorkingDay, int maxWorkingHour) {
		this.companyName = companyName;
		this.fullTimeWorkingHour = fullTimeWorkingHour;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDay = maxWorkingDay;
		this.maxWorkingHour = maxWorkingHour;
	}

	public int checkEmpAttendance(int totalWorkingHour, int fullTimeWorkingHour,
			int maxWorkingHour) {
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

	@Override
	public void calculateEmployeeWage() {
		int totalWorkingHour = 0;
		int day = 0;
		while (day < maxWorkingDay && totalWorkingHour < maxWorkingHour) {
			day++;
			int isEmpPresent = checkEmpAttendance(totalWorkingHour, fullTimeWorkingHour,
					maxWorkingHour);

			int empHr = getWorkingHour(isEmpPresent, fullTimeWorkingHour);

			totalWorkingHour = totalWorkingHour + empHr;
		}
//		System.out
//				.println(companyName + "'s Working Hour : " + totalWorkingHour + " Hour");
		totalSalary = totalWorkingHour * wagePerHour;
	}

	@Override
	public String toString() {
		return companyName + "'s Employee monthly salary :$" + totalSalary + " USD";
	}

	@Override
	public double getTotalSalary() {
		return totalSalary;
	}
	
	@Override
	public String getCompanyName() {
		return companyName;
	}
}