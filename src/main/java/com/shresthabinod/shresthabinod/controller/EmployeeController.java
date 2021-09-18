package com.shresthabinod.shresthabinod.controller;

import com.shresthabinod.shresthabinod.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


// https requests through this  class
@RestController
public class EmployeeController {
    //localhost:8080/employees
    @GetMapping("/employees")
    public String getEmployees(){
        return "Displaying the list of employee";
    }
    //localhost:8080/employees/01
    @GetMapping("/employees/{employee_id}")
    public String getEmployee(@PathVariable("employee_id") long employee_id){
        return  "Getting the employee details for " + employee_id;
    }
    
    @PostMapping(value="/employees")
    public String saveEmployee (@RequestBody Employee employee ) {
        return "Saving employee" + employee;
    }
    

}
