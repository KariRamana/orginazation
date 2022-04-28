package com.zensar.salarycomperator;

import java.util.Comparator;

import com.zensar.employees.Employees;



public class SalaryComparator implements Comparator<Object> {
	public int compare(Object o1, Object o2) {
		Employees e1 = (Employees) o1;
		Employees e2 = (Employees) o2;
		if (e1.getEmployeeSalary() < e2.getEmployeeSalary()) {
			return -1;
		}
		if (e1.getEmployeeSalary() > e2.getEmployeeId()) {
			return 1;
		}
		if (e1.getEmployeeSalary() == e2.getEmployeeId()) {
			return 0;
		}
		return 1234;
	}

}
