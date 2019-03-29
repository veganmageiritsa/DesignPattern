package com.behavioral.chain_responsibility;

public class Lead extends Employee {


    @Override
    protected boolean processRequest(LeaveApplication application) {
        return false;
    }
}
