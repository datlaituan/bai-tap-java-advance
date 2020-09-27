package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Salary", catalog = "TestingSystem")
public class Salary implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "SalaryID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salaryId;

	@Column(name = "SalaryName")
	private String salaryName;

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public String getSalaryName() {
		return salaryName;
	}

	public void setSalaryName(String salaryName) {
		this.salaryName = salaryName;
	}

	public Salary() {
	}

}
