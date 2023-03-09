package com.example.domain;

public class Manager extends Employee {
    private String deptName;
    // private List<Employee> staff;
    // private int employeeCount = 0;
    
    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super (empId, name, ssn, salary);
        // if (employeeCount > 20){
//            return;
//        }
        this.deptName = deptName;
        //        employeeCount++;
    }
    
    public String getDeptName(){
        return deptName;
    }
}
