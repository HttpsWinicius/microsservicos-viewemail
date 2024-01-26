package com.ms.view.email.controllers;


import com.ms.view.email.models.EmailModel;
import com.ms.view.email.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/view/email")
public class EmailController {

    @Autowired
    EmailService service;


    @GetMapping()
    public ResponseEntity<EmailModel> findEmail(@RequestParam int email_id) {
        EmailModel emailModel;
        emailModel = service.findEmail(email_id);
        return new ResponseEntity<>(emailModel, HttpStatus.OK);
    }


}
