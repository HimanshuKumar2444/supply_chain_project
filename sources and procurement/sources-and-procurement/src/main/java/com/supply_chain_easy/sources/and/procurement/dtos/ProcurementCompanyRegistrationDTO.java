package com.supply_chain_easy.sources.and.procurement.dtos;

import com.supply_chain_base_operation.Enum.CompanyStatus;
import com.supply_chain_base_operation.Enum.CompanyType;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProcurementCompanyRegistrationDTO {
    private String procurementCompanyCode;
    private String procurementModel;
    private String procurementStrategy;
    private BigDecimal procurementSpend;
    private BigDecimal procurementBudget;
    private String defaultCurrency;

    private boolean controlEnabled;
    private boolean purchaseRequisitionRequired;
    private boolean purchaseOrderRequired;
    private boolean sourcingRequired;
    private boolean contractRequired;
    private boolean supplierApprovalRequired;
    private boolean multiLevelApprovalEnabled;
    private boolean threeWayMatchEnabled;

    private String legalName;
    private String companyCode;
    private String registrationNo;
    private String industryName;
    private String businessDescription;
    private String website;
    private CompanyStatus companystatus;
    private String email;
    private String phoneNo;
    private String registeredAddress;
}
