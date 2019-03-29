package com.behavioral.chain_responsibility;

public class Director extends Employee {


    public Director(String name, String role, LeaveApprover successor) {
        super(name, "Director", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application) {
        if (application.getFrom().compareTo(application.getTo())>=2 && application.getType()== LeaveApplication.Type.Sick) {
            application.setAproovedBy(getAprooverRole());
        return true;
        }
        return false;
    }
}
