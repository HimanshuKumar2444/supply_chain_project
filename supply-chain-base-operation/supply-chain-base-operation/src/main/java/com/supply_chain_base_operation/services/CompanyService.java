package com.supply_chain_base_operation.services;

import com.supply_chain_base_operation.model.Company;
import com.supply_chain_base_operation.model.Employee;
import com.supply_chain_base_operation.model.Role;
import com.supply_chain_base_operation.model.User;
import com.supply_chain_base_operation.transformers.SystemTransformer;
import com.supply_chain_base_operation.utility.SystemUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {


    @Autowired
    private  RoleService roleService;

    @Autowired
    private EmployeeService employeeService;
    //    work of this function is create admin user for the company.
    public User createAdminForcompany(Company company){

//        before creating admin user we should create admin for the role for the company..
//        creation of admin role -> common for all the project lets keep it common points.

        Role adminrole= roleService.createAdminRole(company.getLegalName());

       Employee employee= SystemTransformer.mapCompanyToAdminEmployee(company,adminrole);
      return employeeService.saveEmployee(employee);



    }

}
