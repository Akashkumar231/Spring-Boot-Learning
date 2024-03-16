package com.akash.springboot.cruddemo.dao;

import com.akash.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    // define the Field for entitymanager.

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager entityManager){

        this.entityManager = entityManager;

    }


    @Override
    public List<Employee> findAll() {

        // create a query

        TypedQuery<Employee>  theQuery = entityManager.createQuery("from Employee",Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findById(int theId) {

        Employee tempEmployee = entityManager.find(Employee.class,theId);

        //
        return tempEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return the dbEmployee
        return dbEmployee;

    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class , theId);

        // remove employee
        entityManager.remove(theEmployee );

    }
}
