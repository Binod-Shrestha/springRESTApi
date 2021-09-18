package com.shresthabinod.shresthabinod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// https requests through this class
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

    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam("employee_id") long employee_id){
        return "Deleting employee with id: " + employee_id;
    }

}
