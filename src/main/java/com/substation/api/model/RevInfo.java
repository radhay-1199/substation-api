package com.substation.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "revinfo")
public class RevInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer rev;
	
	@OneToOne(mappedBy = "subStnRprt")
    private PrimaryKeys subStnRprt;
	
	@Column
	private Long revtstmp;
	
}
