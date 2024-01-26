package com.ms.view.email.services;


import com.ms.view.email.models.EmailModel;
import com.ms.view.email.repositorys.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {


    @Autowired
    EmailRepository repository;

    public EmailModel findEmail(int email_id) {
        try {
            return repository.findEmail(email_id);
        } catch (Exception e) {
            return null;
        }

    }
}
