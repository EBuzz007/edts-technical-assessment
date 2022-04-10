package com.ebuzz.technicalassessment.model;

import java.math.BigInteger;

public class EmployeeRequest {

    Long id;
    String name;
    Long salary;
    String gradeCode;

    public EmployeeRequest() {
    }

    public EmployeeRequest(Long id, String name, Long salary, String gradeCode) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gradeCode = gradeCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }
}
