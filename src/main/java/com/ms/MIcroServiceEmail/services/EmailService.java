package com.ms.MIcroServiceEmail.services;

import com.ms.MIcroServiceEmail.models.EmailModel;
import com.ms.MIcroServiceEmail.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
    @Autowired
    EmailRepository emailRepository;

    public static void sendEmail(EmailModel emailModel) {

    }
}
