package com.substation.api.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import com.sun.istack.NotNull;

@Embeddable
public class PrimaryKeys implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Integer sno;
	
	private Integer rev;
	
	@OneToOne
    @JoinColumn(name = "rev", referencedColumnName="rev")
    @MapsId
    private RevInfo subStnRprt;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Integer getRev() {
		return rev;
	}

	public void setRev(Integer rev) {
		this.rev = rev;
	}
	
}
