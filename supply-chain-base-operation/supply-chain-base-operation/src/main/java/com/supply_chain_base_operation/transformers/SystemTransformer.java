package com.supply_chain_base_operation.transformers;

import com.supply_chain_base_operation.Enum.AuthenticationProvider;
import com.supply_chain_base_operation.Enum.EmployementStatus;
import com.supply_chain_base_operation.Enum.UserStatus;
import com.supply_chain_base_operation.constants.SystemConstants;
import com.supply_chain_base_operation.model.Company;
import com.supply_chain_base_operation.model.Employee;
import com.supply_chain_base_operation.model.Role;
import com.supply_chain_base_operation.utility.SystemUtility;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class SystemTransformer {

    public static Employee mapCompanyToAdminEmployee(Company company , Role Admin_Role) {

        if (company == null) {
            return null;
        }

        Employee adminEmployee = Employee.builder()

                // User fields
                .userId(SystemUtility.generateId(company.getLegalName()))
                .firstName("System")
                .lastName("Administration")
                .email(company.getEmail())
                .phoneNo(company.getPhoneNo())
                .address(company.getRegisteredAddress())
                .password(SystemUtility.generatePassword(SystemConstants.DEFAULT_PASSWORD_LENGTH))
                .status(UserStatus.ACTIVE)
                .authenticationProvider(AuthenticationProvider.LOCAL)
                .emailVerified(false)
                .phoneVerified(false)
                .twoFactorEnabled(false)
                .failedLoginAttempts(0)
                .accountLocked(false)
                .preferredCurrency("INR")
                .currency("INR")
                .timeZone("Asia/Kolkata")
                .state(null)
                .city(null)
                .postalCode(null)
                .active(true)
                .lastActiveAt(Instant.now())


                // Employee fields
                .employeeID(SystemUtility.generateId("Employee"))
                .workEmail(company.getEmail())
                .jobTittle("Company Administrator")
                .designation("Administrator")
                .employeeType("ADMIN")
                .employementStatus(EmployementStatus.ACTIVE)
                .joiningDate(LocalDate.now())
                .approvalLimit(BigDecimal.valueOf(999999999))
                .approvalCurrency("INR")
                .officeLocation(company.getRegisteredAddress())
                .active(true)
                .roles(List.of(Admin_Role))
                // Company relationship

                .build();

        return adminEmployee;
    }



}
