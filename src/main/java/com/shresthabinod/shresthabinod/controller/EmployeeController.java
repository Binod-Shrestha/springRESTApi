package com.shresthabinod.shresthabinod.controller;

import com.shresthabinod.shresthabinod.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


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

}
