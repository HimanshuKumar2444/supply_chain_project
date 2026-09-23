package com.supply_chain_base_operation.services;

import com.supply_chain_base_operation.model.Employee;
import com.supply_chain_base_operation.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeRepository employeRepository;

    public Employee saveEmployee(Employee employee){

       return employeRepository.save(employee);

    }
}
