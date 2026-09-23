package com.supply_chain_base_operation.repository;

import com.supply_chain_base_operation.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {
}
