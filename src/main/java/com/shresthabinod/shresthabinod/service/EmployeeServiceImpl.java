package com.shresthabinod.shresthabinod.service;

import com.shresthabinod.shresthabinod.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private static final List<Employee> listOfEmployee = new ArrayList<>();

    static {
        Employee emp = new Employee();
        emp.setName("Binod Shrestha");
        emp.setAge(40);
        emp.setLocation("Brampton");
        emp.setEmail("example@gmail.com");
        emp.setDepartment("IT");
        listOfEmployee.add(emp);

        emp = new Employee();
        emp.setName("Puja Shrestha");
        emp.setAge(35);
        emp.setLocation("Toronto");
        emp.setEmail("example@outlook.com");
        emp.setDepartment("Service");
        listOfEmployee.add(emp);
    }


    @Override
    public List<Employee> getEmployee() {
        return listOfEmployee;
    }
}
