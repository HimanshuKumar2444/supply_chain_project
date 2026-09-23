package com.supply_chain_base_operation.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
@SuperBuilder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="procurement_company")
public class ProcurementCompany extends Company{

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
}
