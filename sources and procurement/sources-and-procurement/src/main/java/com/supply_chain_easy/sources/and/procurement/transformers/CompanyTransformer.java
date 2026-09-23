package com.supply_chain_easy.sources.and.procurement.transformers;


import com.supply_chain_base_operation.Enum.CompanyStatus;
import com.supply_chain_base_operation.model.ProcurementCompany;
import com.supply_chain_easy.sources.and.procurement.dtos.ProcurementCompanyRegistrationDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CompanyTransformer {

    public ProcurementCompany ProcurementCompanyRegistrationDTOToCompanyModel(ProcurementCompanyRegistrationDTO dto){
        ProcurementCompany procurementCompany=ProcurementCompany.builder()
                // Company fields
                .legalName(dto.getLegalName())
                .CompanyCode(dto.getCompanyCode())
                .registrationNo(dto.getRegistrationNo())
                .industryName(dto.getIndustryName())
                .businessDescription(dto.getBusinessDescription())
                .website(dto.getWebsite())
                .companystatus(dto.getCompanystatus())
                .email(dto.getEmail())
                .phoneNo(dto.getPhoneNo())
                .registeredAddress(dto.getRegisteredAddress())

                // ProcurementCompany fields
                .procurementCompanyCode(dto.getProcurementCompanyCode())
                .procurementModel(dto.getProcurementModel())
                .procurementStrategy(dto.getProcurementStrategy())
                .procurementSpend(dto.getProcurementSpend())
                .procurementBudget(dto.getProcurementBudget())
                .defaultCurrency(dto.getDefaultCurrency())

                .controlEnabled(dto.isControlEnabled())
                .purchaseRequisitionRequired(dto.isPurchaseRequisitionRequired())
                .purchaseOrderRequired(dto.isPurchaseOrderRequired())
                .sourcingRequired(dto.isSourcingRequired())
                .contractRequired(dto.isContractRequired())
                .supplierApprovalRequired(dto.isSupplierApprovalRequired())
                .multiLevelApprovalEnabled(dto.isMultiLevelApprovalEnabled())
                .threeWayMatchEnabled(dto.isThreeWayMatchEnabled())
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .createdBy("SYSTEM")
                .updatedBy("System")
                .companystatus(CompanyStatus.UNDER_REVIEW)
                .active(false)
                .build();


        return  procurementCompany;



    }
}
