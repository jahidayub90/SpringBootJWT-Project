package com.Meritech.jwtAuthenticatio5.Service;


import com.Meritech.jwtAuthenticatio5.Employee.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class EmployeeService {

    private List<Employee> emplist = new ArrayList<>();
    public EmployeeService(){
        emplist.add(new Employee(UUID.randomUUID().toString(),"Jahid", "jahid@gmail"));
        emplist.add(new Employee(UUID.randomUUID().toString(),"Arman", "Arman@12gmail.com"));

    }
    public List<Employee> getEmployeeList(){
        return emplist;

    }

}
