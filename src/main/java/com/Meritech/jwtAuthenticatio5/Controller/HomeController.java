package com.Meritech.jwtAuthenticatio5.Controller;


import com.Meritech.jwtAuthenticatio5.Employee.Employee;
import com.Meritech.jwtAuthenticatio5.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")

public class HomeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
      public List<Employee> getEmployeesList(){

        return employeeService.getEmployeeList();



      }

}
