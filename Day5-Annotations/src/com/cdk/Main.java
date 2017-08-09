package com.cdk;

import com.cdk.Emp.Employee;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee(25, "Sudhir", "Sharma", 30);
		System.out.println(emp.toString());
	}
}