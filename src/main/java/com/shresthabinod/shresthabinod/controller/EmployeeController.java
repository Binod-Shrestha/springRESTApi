package com.shresthabinod.shresthabinod.controller;

import com.shresthabinod.shresthabinod.model.Employee;
import com.shresthabinod.shresthabinod.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// https requests through this  class
@RestController
//@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //localhost:8080/api/v1/employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getEmployee();
    }
    //localhost:8080/api/v1/employees/01
    @GetMapping("/employees/{employee_id}")
    public String getEmployee(@PathVariable long employee_id){
        return  "Getting the employee details for " + employee_id;
    }
    
    @PostMapping(value="/employees")
    public String saveEmployee (@RequestBody Employee employee ) {
        return "Saving employee" + employee;
    }

    @PutMapping("/employees/{employee_id}")
    public Employee updateEmployee(@PathVariable long employee_id, @RequestBody Employee employee){
        System.out.println("Updating the employee with id: " + employee_id);
        return employee;
}

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("employee_id") long employee_id){
        return "Deleting employee with id: " + employee_id;
    }

}
