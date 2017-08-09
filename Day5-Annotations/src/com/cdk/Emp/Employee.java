package com.cdk.Emp;

import com.cdk.Annotations.Company;
import com.cdk.Annotations.TimeStamp;
import com.cdk.Enumerations.Day;
import com.cdk.Enumerations.Month;
import com.cdk.Enumerations.Year;

@Company(name = "CDK Global", location = "Pune")
@TimeStamp(year = Year.YEAR2020, month = Month.NOVEMBER, day = Day.FRIDAY)

public class Employee {
    int empId;
    String fName;
    String lName;
    int deptId;

    public Employee(int empId, String fName, String lName, int deptId) {
        this.empId = empId;
        this.fName = fName;
        this.lName = lName;
        this.deptId = deptId;
    }

    public int getEmpId() {
        return empId;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getDeptId() {
        return deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}