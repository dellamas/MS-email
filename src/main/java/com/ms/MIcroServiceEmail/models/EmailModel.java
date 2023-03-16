package com.ms.MIcroServiceEmail.models;

import com.ms.MIcroServiceEmail.enums.StatusEmail;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="TB_EMAIL")

public class EmailModel implements Serializable {
    private static final long serialVersionUID=1l;
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long emailId;
    private String OwnerRef;
    private String emailFrom;
    private String emailTo;
    private String Subject;
    @Column(columnDefinition ="TEXT")
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;


}
