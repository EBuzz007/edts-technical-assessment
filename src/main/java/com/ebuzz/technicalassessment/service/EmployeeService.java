package com.ebuzz.technicalassessment.service;

import com.ebuzz.technicalassessment.model.EmployeeBonus;
import com.ebuzz.technicalassessment.model.EmployeeRequest;
import com.ebuzz.technicalassessment.model.EmployeeResponse;

import java.util.List;

public interface EmployeeService {
    public EmployeeResponse addEmployee(EmployeeRequest empReq);
    public EmployeeResponse editEmployee(EmployeeRequest empReq);
    public List<EmployeeBonus> listEmployeeBonus();
}
