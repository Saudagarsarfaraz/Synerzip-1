package com.psa.SpringData_jpa_app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EMP_TBL {
    
	@Override
	public String toString() {
		return "EMP_TBL [EMP_ID=" + EMP_ID + ", EMP_NAME=" + EMP_NAME + ", EMP_SAL=" + EMP_SAL + "]";
	}
	@Id
	private Long EMP_ID;
	private String EMP_NAME;
	private Long EMP_SAL;
	
	public Long getEMP_ID() {
		return EMP_ID;
	}
	public void setEMP_ID(Long eMP_ID) {
		EMP_ID = eMP_ID;
	}
	public String getEMP_NAME() {
		return EMP_NAME;
	}
	public void setEMP_NAME(String eMP_NAME) {
		EMP_NAME = eMP_NAME;
	}
	public Long getEMP_SAL() {
		return EMP_SAL;
	}
	public void setEMP_SAL(Long eMP_SAL) {
		EMP_SAL = eMP_SAL;
	}
	
	
	
}
