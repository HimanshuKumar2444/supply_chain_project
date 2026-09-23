package com.supply_chain_base_operation.model;

import com.supply_chain_base_operation.Enum.CompanyStatus;
import com.supply_chain_base_operation.Enum.CompanyType;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name="company")
public class Company extends GlobalRecord {
   private String companyId;
   private String legalName;
   private String CompanyCode;
   private String registrationNo;
   private CompanyType companytype;
   private String industryName;
   private String businessDescription;
   private String website;
   private CompanyStatus companystatus;
   private String email;
   private String phoneNo;
   private String registeredAddress;
   private boolean active;

}
