package com.behavioral.chain_responsibility;

public interface  LeaveApprover {

     void processLeaveApproval(LeaveApplication leaveApplication);

     String getAprooverRole();
}
