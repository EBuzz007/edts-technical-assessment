package com.ebuzz.technicalassessment;

import com.ebuzz.technicalassessment.controller.EmployeeController;
import com.ebuzz.technicalassessment.model.EmployeeRequest;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class TechnicalAssessmentApplicationTests {

	@Autowired
	private EmployeeController employeeController;

	@Test
	@DisplayName("Add Employee Success")
	void Scenario1() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10001"));
		empReq.setName("Jonah Bluesky");
		empReq.setSalary(new Long("7563000"));
		empReq.setGradeCode("1");

		assertEquals("Employee data added successfully", employeeController.addEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("Add Employee Failed Invalid Grade")
	void Scenario2() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10002"));
		empReq.setName("Stevenson Black");
		empReq.setSalary(new Long("5124000"));
		empReq.setGradeCode("4");

		assertEquals("Invalid grade!", employeeController.addEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("Add Employee Failed ID Already Exist")
	void Scenario3() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10001"));
		empReq.setName("Susan Random");
		empReq.setSalary(new Long("7563000"));
		empReq.setGradeCode("1");

		assertEquals("ID " + String.valueOf(empReq.getId()) + " already exist!", employeeController.addEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("Edit Employee Success")
	void Scenario4() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10001"));
		empReq.setName("Jonah Bluesky");
		empReq.setSalary(new Long("7563000"));
		empReq.setGradeCode("2");

		assertEquals("Employee data edited successfully", employeeController.editEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("Edit Employee Failed Invalid Grade")
	void Scenario5() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10001"));
		empReq.setName("Jonah Bluesky");
		empReq.setSalary(new Long("7563000"));
		empReq.setGradeCode("4");

		assertEquals("Invalid grade!", employeeController.editEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("Edit Employee Failed ID Not Found")
	void Scenario6() {

		EmployeeRequest empReq = new EmployeeRequest();
		empReq.setId(new Long("10005"));
		empReq.setName("Jonah Bluesky");
		empReq.setSalary(new Long("7563000"));
		empReq.setGradeCode("2");

		assertEquals("ID " + String.valueOf(empReq.getId()) + " not found!", employeeController.editEmployee(empReq).getMessage());
	}

	@Test
	@DisplayName("List Employee Bonus")
	void Scenario7() {
		assertNotNull(employeeController.listEmployeeBonus());
	}
}
