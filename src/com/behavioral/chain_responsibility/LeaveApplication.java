package com.behavioral.chain_responsibility;

import java.time.LocalDate;

public class LeaveApplication {

    public String getAproovedBy() {
        return aproovedBy;
    }

    public void setAproovedBy(String aproovedBy) {
        this.aproovedBy = aproovedBy;
    }

    public enum Type {Sick, PTO, LOP};

    public enum Status {Pending, Approved, Rejected};

    private LocalDate from;
    private LocalDate to;
    private String processedBy;
    private String appliedBy;
    private String aproovedBy;
    private Status status;
    private Type type;

    public LeaveApplication(LocalDate from, LocalDate to, String processedBy, String appliedBy, String aproovedBy) {
        this.from = from;
        this.to = to;
        this.processedBy = processedBy;
        this.appliedBy = appliedBy;
        this.aproovedBy = aproovedBy;
        this.status = Status.Pending;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public String getProcessedBy() {
        return processedBy;
    }

    public void setProcessedBy(String processedBy) {
        this.processedBy = processedBy;
    }

    public String getAppliedBy() {
        return appliedBy;
    }

    public void setAppliedBy(String appliedBy) {
        this.appliedBy = appliedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
