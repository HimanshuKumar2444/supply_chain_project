package com.supply_chain_base_operation.model;


import com.supply_chain_base_operation.Enum.EmployementStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee extends User {
    private String employeeID;
    private String workEmail;
    private String personalEmail;
    private String phoneNumber;
    private String jobTittle;
    private String designation;
    private String employeeType;
    private EmployementStatus employementStatus;
    private LocalDate joiningDate;
    private LocalDate exitDate;
    @ManyToOne
    private Employee manager;
    private String officeLocation;
    private String country;
    private String state;
    private String city;
    private BigDecimal approvalLimit;
    private String approvalCurrency;
    private boolean active;
}
