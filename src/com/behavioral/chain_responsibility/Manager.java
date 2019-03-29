package com.behavioral.chain_responsibility;

public class Manager extends Employee {


    public Manager(String name, String role, LeaveApprover successor) {
        super(name, "Manager", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        return false;
    }
}
