package com.supply_chain_easy.sources.and.procurement.services;

import com.supply_chain_base_operation.model.Employee;
import com.supply_chain_base_operation.model.ProcurementCompany;
import com.supply_chain_base_operation.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

@Service
public class EmailService {

    @Autowired
    private TemplateEngine templateEngine;

    @Autowired
    private NotificationService notificationService;

    public EmailService(TemplateEngine templateEngine, NotificationService notificationService) {
        this.templateEngine = templateEngine;
        this.notificationService = notificationService;
    }


    public  void sendRegistrationToProcurementCompany(ProcurementCompany procurementCompany, Employee admin){

        Context context=new Context();
        context.setVariable("firstName",admin.getFirstName());
        context.setVariable("companyName",procurementCompany.getLegalName());
        context.setVariable("email",admin.getEmail());
        context.setVariable("employeeId",admin.getEmployeeID());
        context.setVariable("lastName",admin.getLastName());

        String htmlContent=templateEngine.process("procurement_company_registration",context);
        notificationService.sendEmailNotifaction(htmlContent, admin.getEmail(), "Welcome For Registration inHimanshu Company");


    }


}
