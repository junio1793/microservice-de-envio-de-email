package com.junior.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "DBEMAIL")
public class Model {
	
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id_Email;
	    private String ownerRef;
	    private String emailFrom;
	    private String emailTo;
	    private String subject;
	    @Column(columnDefinition = "TEXT")
	    private String text;
	    private LocalDateTime sendDateTime;
	    private StatusEmail statusEmail;


}
