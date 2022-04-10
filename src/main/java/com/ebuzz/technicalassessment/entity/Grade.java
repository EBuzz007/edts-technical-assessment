package com.ebuzz.technicalassessment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Grade implements Serializable {

    @Id
    private Long id;
    private String gradeCode;
    private String gradeName;
    private Integer bonusPercentage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGradeCode() {
        return gradeCode;
    }

    public void setGradeCode(String gradeCode) {
        this.gradeCode = gradeCode;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getBonusPercentage() {
        return bonusPercentage;
    }

    public void setBonusPercentage(Integer bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }
}
