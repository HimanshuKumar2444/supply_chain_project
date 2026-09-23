package com.supply_chain_easy.sources.and.procurement.controllers;

import com.supply_chain_base_operation.model.ProcurementCompany;
import com.supply_chain_easy.sources.and.procurement.dtos.ProcurementCompanyRegistrationDTO;
import com.supply_chain_easy.sources.and.procurement.services.ProcureCompanyRegistrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("apis/v1/procurement-company")
public class RegistrationProcurementCompany {
    @Autowired
    private ProcureCompanyRegistrationService procureCompanyRegistrationService;

    @PostMapping("/register")
    public ResponseEntity<?> onBoardProcurementCompany(@RequestBody ProcurementCompanyRegistrationDTO procurementCompanyRegistrationDTO){

        ProcurementCompany res=procureCompanyRegistrationService.procurementCompanyRegistration(procurementCompanyRegistrationDTO);

        return  new ResponseEntity<>(res,HttpStatus.CREATED);

    }

}
