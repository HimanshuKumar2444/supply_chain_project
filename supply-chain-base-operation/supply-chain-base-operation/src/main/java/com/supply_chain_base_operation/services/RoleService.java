package com.supply_chain_base_operation.services;

import com.supply_chain_base_operation.model.Company;
import com.supply_chain_base_operation.model.Operation;
import com.supply_chain_base_operation.model.Role;
import com.supply_chain_base_operation.repository.RoleRepository;
import com.supply_chain_base_operation.utility.SystemUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RoleService {


    @Autowired
    private OperationService operationService;

    @Autowired
    private RoleRepository roleRepository;

    public Role createAdminRole(String companyName){

//        Admin can perform all the operation on our application.
//        so, the role object which we will create ->it will have acess to all the operations.
//        to create role object we want list of t all the operation.
//        so to get list of all the operations we need to  call operation service.

        List<Operation> operationList=operationService.fetchAllOpertaion();
        Role adminRole=Role.builder()
                .roleId(SystemUtility.generateId("Role"))
                .roleName(companyName+"-"+"MAINT")
                .operationList(operationList)
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .createdBy("System")
                .updatedBy("System")
                .build();

        roleRepository.save(adminRole);
        return adminRole;

    }
}
