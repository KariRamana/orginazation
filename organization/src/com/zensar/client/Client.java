package com.zensar.client;

import java.util.HashSet;
import java.util.Set;

import com.zensar.employees.Employees;

public class Client {
	public static void main(String args[]) {
		Employees e1 = new Employees(1001, "Teja", 40000);
		Employees e2 = new Employees(1003, "Ramana", 30000);
		Employees e3 = new Employees(1002, "Hari", 10000);

		Set<Employees> set = new HashSet<Employees>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		System.out.println(set);
	}
}
