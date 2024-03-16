package com.akash.springboot.cruddemo.rest;

import com.akash.springboot.cruddemo.dao.EmployeeRepository;
import com.akash.springboot.cruddemo.entity.Employee;
import com.akash.springboot.cruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class EmployeeRestController {

   private EmployeeRepository employeeRepository;

   private EmployeeService employeeService;

    //  quick and dirty: inject the employee dao

    @Autowired
    public EmployeeRestController(EmployeeService theEmployeeService){

        this.employeeService = theEmployeeService;

    }

    // expose "/employees" and return a list of Employee

    @GetMapping("employees")
    public List<Employee> findAll(){

        return  employeeService.findAll();

    }

    // add mapping for GET /employees/{employeeId}

    @GetMapping("/employees/{employeeId}")
    public Employee findById(@PathVariable int employeeId){

        Employee theEmployee = employeeService.findById(employeeId);

        if(theEmployee == null){

            throw  new RuntimeException("Employee id not found - " + employeeId);

        }

        return theEmployee;

    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee theEmployee){

        // also just in case they pass an id in JSON ... set id to
        // this is to force a save of new item ... instead of update

        theEmployee.setId(0);

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;

    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;

    }

    // add mapping for DELETE /employees/{employeeId} - delete employee
    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId)
    {

        Employee tempEmployee = employeeService.findById(employeeId);

        // throw exception if null

        if(tempEmployee == null){

            throw new RuntimeException("Employee id not found - " + employeeId);

        }

       employeeService.deleteById(employeeId);

       return "Deleted employee id - " + employeeId;
    }

}
