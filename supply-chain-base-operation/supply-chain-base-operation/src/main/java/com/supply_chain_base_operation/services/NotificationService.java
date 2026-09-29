package com.supply_chain_base_operation.services;

import com.supply_chain_base_operation.constants.SystemConstants;
import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private static final Logger log = LoggerFactory.getLogger(NotificationService.class);
    @Autowired
    private  JavaMailSender javaMailSender;

    public void sendEmailNotifaction(String htmlcontent,String toEmailAddress,String subject){

        MimeMessage mimeMessage=javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper=new MimeMessageHelper(mimeMessage);

        for(int i=0;i< SystemConstants.EMAIL_RETRY_ATTEMPTS;i++){
            try {
                mimeMessageHelper.setSubject(toEmailAddress);
                mimeMessageHelper.setTo(toEmailAddress);
                mimeMessageHelper.setText(htmlcontent,true);
                javaMailSender.send(mimeMessage);
                break;
            }catch(Exception e){
                log.info(String.format("send Email Got Failed....."+e.getMessage()));
            }
        }





    }
}
