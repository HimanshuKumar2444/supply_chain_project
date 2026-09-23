package com.supply_chain_easy.sources.and.procurement.services;

import com.supply_chain_base_operation.model.Employee;
import com.supply_chain_base_operation.model.ProcurementCompany;
import com.supply_chain_base_operation.repository.ProcurementCompanyRepository;
import com.supply_chain_base_operation.services.CompanyService;
import com.supply_chain_easy.sources.and.procurement.dtos.ProcurementCompanyRegistrationDTO;
import com.supply_chain_easy.sources.and.procurement.transformers.CompanyTransformer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ProcureCompanyRegistrationService {

    @Autowired
    private CompanyTransformer companyTransformer;

    @Autowired
    private ProcurementCompanyRepository procurementCompanyRepository;

    @Autowired
    private CompanyService companyService;



    public ProcurementCompany procurementCompanyRegistration(ProcurementCompanyRegistrationDTO procurementCompanyRegistrationDTO){


//          1. mapping all the details to procurement model object..
//           2. id  mapping logic  do here the its too clumbsy  thats why i create transformer package.
//            3. save the the object

         ProcurementCompany procurementCompany=companyTransformer.ProcurementCompanyRegistrationDTOToCompanyModel(procurementCompanyRegistrationDTO);
//        3. save the the object
         procurementCompanyRepository.save(procurementCompany);

//         4. Create Admin Role For This Company After creating Admin Role We have to create
//            Admin user of the company ...

       companyService.createAdminForcompany(procurementCompany);

        return procurementCompany;

    }
}
