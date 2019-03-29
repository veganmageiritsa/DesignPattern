package com.behavioral.chain_responsibility;

public class Lead extends Employee {

    public Lead(String name, String role, LeaveApprover successor) {
        super(name, role, successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        return false;
    }
}
