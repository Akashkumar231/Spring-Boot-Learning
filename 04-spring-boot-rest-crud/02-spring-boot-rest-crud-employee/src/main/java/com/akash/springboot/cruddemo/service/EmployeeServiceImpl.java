package com.akash.springboot.cruddemo.service;

import com.akash.springboot.cruddemo.dao.EmployeeDAO;
import com.akash.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){

        employeeDAO = theEmployeeDAO;

    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Transactional
    @Override
    public Employee findById(int id) {

        return employeeDAO.findById(id);

    }
    @Transactional
    @Override
    public Employee save(Employee theEmployee) {

        return employeeDAO.save(theEmployee);

    }

    @Transactional
    @Override
    public void deleteById(int theId) {

     employeeDAO.deleteById(theId);

    }
}
