package com.ebuzz.technicalassessment.controller;

import com.ebuzz.technicalassessment.model.EmployeeBonus;
import com.ebuzz.technicalassessment.model.EmployeeRequest;
import com.ebuzz.technicalassessment.model.EmployeeResponse;
import com.ebuzz.technicalassessment.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add")
    public EmployeeResponse addEmployee(@RequestBody EmployeeRequest empReq){
        return employeeService.addEmployee(empReq);
    }

    @PostMapping("/edit")
    public EmployeeResponse editEmployee(@RequestBody EmployeeRequest empReq){
        return employeeService.editEmployee(empReq);
    }

    @GetMapping("/listBonus")
    public List<EmployeeBonus> listEmployeeBonus(){
        return employeeService.listEmployeeBonus();
    }
}
