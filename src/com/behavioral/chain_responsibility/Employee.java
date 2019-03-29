package com.behavioral.chain_responsibility;

public abstract class Employee implements LeaveApprover {

    private String name;
    private String role;
    private LeaveApprover successor;


    public Employee(String name, String role, LeaveApprover successor) {
        this.name = name;
        this.role = role;
        this.successor = successor;
    }

    @Override
    public void processLeaveApproval(LeaveApplication leaveApplication) {
        if (!processRequest(leaveApplication) && successor != null)
            successor.processLeaveApproval(leaveApplication);
    }

    @Override
    public String getAprooverRole() {
        return role;
    }

    protected abstract boolean processRequest(LeaveApplication application);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LeaveApprover getSuccessor() {
        return successor;
    }

    public void setSuccessor(LeaveApprover successor) {
        this.successor = successor;
    }
}
