package com.ebuzz.technicalassessment.model;

public class EmployeeBonus {

    private Long id;
    private String name;
    private Long salary;
    private String gradeCode;
    private Long totalBonus;

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

    public Long getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(Long totalBonus) {
        this.totalBonus = totalBonus;
    }
}
