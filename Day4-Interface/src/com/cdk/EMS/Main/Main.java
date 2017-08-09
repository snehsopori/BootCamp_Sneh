package com.cdk.EMS.Main;

import com.cdk.EMS.Employee.EmployeeService;
import com.cdk.EMS.Employee.Month;
import com.cdk.EMS.Employee.Year;
import com.cdk.EMS.company.City;
import com.cdk.EMS.company.CompanyService;

class Main {
	public static void main(String[] args) {
		
		EmployeeService employee = new EmployeeService(15, "Raj", Month.DEC, Year._2017);
		employee.getDetails();
		
		CompanyService company = new CompanyService("CDK", 200, City.Pune);
		company.getDetails();
	}
}