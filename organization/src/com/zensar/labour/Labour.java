package com.zensar.labour;

import com.zensar.employees.Employees;

public class Labour extends Employees {
	private int overtime;
	private int rate;

	public Labour() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getHours() {
		return overtime;
	}

	public void setHours(int hours) {
		this.overtime = hours;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String toString() {
		return super.toString() + " " + overtime + " " + rate;
	}

	public int calculateSalary() {
		return overtime * rate;
	}

}
