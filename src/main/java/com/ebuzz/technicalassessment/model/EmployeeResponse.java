package com.ebuzz.technicalassessment.model;

public class EmployeeResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public EmployeeResponse(String message) {
        super();
        this.message = message;
    }

    public EmployeeResponse() {
    }
}
