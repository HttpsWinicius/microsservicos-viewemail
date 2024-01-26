package com.ms.view.email.models;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@EnableJpaRepositories
@Entity
public class EmailModel {

    @Id
    @Column(name = "email_id", nullable = false)
    @JsonIgnore
    private Long id;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    private String text;
    private LocalDateTime sendDateEmail;
    @Column(name = "status_email", nullable = false)
    private Boolean statusEnvio;

}
