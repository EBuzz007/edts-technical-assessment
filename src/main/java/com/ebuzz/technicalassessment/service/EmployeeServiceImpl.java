package com.ebuzz.technicalassessment.service;

import com.ebuzz.technicalassessment.entity.Employee;
import com.ebuzz.technicalassessment.entity.Grade;
import com.ebuzz.technicalassessment.model.EmployeeBonus;
import com.ebuzz.technicalassessment.model.EmployeeRequest;
import com.ebuzz.technicalassessment.model.EmployeeResponse;
import com.ebuzz.technicalassessment.repository.EmployeeRepository;
import com.ebuzz.technicalassessment.repository.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private GradeRepository gradeRepository;

    @Override
    public EmployeeResponse addEmployee(EmployeeRequest empReq) {

        Grade grade = gradeRepository.findByGradeCode(empReq.getGradeCode());
        if(grade == null){
            return new EmployeeResponse("Invalid grade!");
        }

        Optional<Employee> existEmp = employeeRepository.findById(empReq.getId());
        if(existEmp.isPresent()){
            return new EmployeeResponse("ID " + String.valueOf(empReq.getId()) + " already exist!");
        }

        Employee emp = new Employee();
        emp.setId(empReq.getId());
        emp.setName(empReq.getName());
        emp.setSalary(empReq.getSalary());
        emp.setGrade(grade);

        employeeRepository.save(emp);

        return new EmployeeResponse("Employee data added successfully");
    }

    @Override
    public EmployeeResponse editEmployee(EmployeeRequest empReq) {
        Grade grade = gradeRepository.findByGradeCode(empReq.getGradeCode());
        if(grade == null){
            return new EmployeeResponse("Invalid grade!");
        }

        Optional<Employee> existEmp = employeeRepository.findById(empReq.getId());
        if(!existEmp.isPresent()){
            return new EmployeeResponse("ID " + String.valueOf(empReq.getId()) + " not found!");
        }

        Employee emp = existEmp.get();
        emp.setId(empReq.getId());
        emp.setName(empReq.getName());
        emp.setSalary(empReq.getSalary());
        emp.setGrade(grade);

        employeeRepository.save(emp);

        return new EmployeeResponse("Employee data edited successfully");
    }

    @Override
    public List<EmployeeBonus> listEmployeeBonus() {

        List<EmployeeBonus> listEmpBonus = new ArrayList<>();

        List<Employee> listEmp = employeeRepository.findAll();

        for(Employee emp : listEmp){
            EmployeeBonus empBonus = new EmployeeBonus();
            empBonus.setId(emp.getId());
            empBonus.setName(emp.getName());
            empBonus.setSalary(emp.getSalary());
            empBonus.setGradeCode(emp.getGrade().getGradeCode() + ":" + emp.getGrade().getGradeName());
            empBonus.setTotalBonus(emp.getSalary() + (emp.getSalary() * emp.getGrade().getBonusPercentage())/100);

            listEmpBonus.add(empBonus);
        }

        return listEmpBonus;
    }

}
