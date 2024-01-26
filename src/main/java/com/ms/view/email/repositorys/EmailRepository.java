package com.ms.view.email.repositorys;

import com.ms.view.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface EmailRepository extends JpaRepository<EmailModel, Long>{


    @Query(value = "SELECT email_id, email_from , email_to , owner_ref ,subject,text,send_date_email,status_email FROM public.tb_email WHERE email_id = ?", nativeQuery = true)
    EmailModel findEmail(int email_id);
}
