package com.zensar.manager;

import com.zensar.employees.Employees;

public class Manager extends Employees {
	private int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public Manager(int incentive) {
		super();
		this.incentive = incentive;
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + "]";
	}

	public int calculateSalary() {
		return super.calculateSalary() + incentive;
	}

}
