package com.ebuzz.technicalassessment.entity;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    private Long id;

    @Column(length = 50)
    private String name;

    private Long salary;

    @ManyToOne(optional=false)
    @JoinColumn(name = "grade_id", nullable = false)
    private Grade grade;

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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
