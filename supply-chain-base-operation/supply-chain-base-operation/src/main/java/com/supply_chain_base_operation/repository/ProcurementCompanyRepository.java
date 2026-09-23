package com.supply_chain_base_operation.repository;

import com.supply_chain_base_operation.model.ProcurementCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProcurementCompanyRepository extends JpaRepository<ProcurementCompany, UUID> {
}
