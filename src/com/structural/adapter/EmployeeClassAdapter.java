package com.structural.adapter;

public class EmployeeClassAdapter extends Employee implements Customer {

    // This is for object adapter it doesnt extends Employee
//    private Employee employee;
//
//    public EmployeeClassAdapter(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String getName() {
        return this.getFulleName();
    }

    @Override
    public String getDesignation() {
        return this.getJobTitle();
    }

    @Override
    public String getAdress() {
        return this.getLocation();
    }
}
