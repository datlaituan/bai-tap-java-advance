package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Employee", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Employee extends Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(name = "WorkingNumberOfYear")
	private int workingNumberOfYear;

	public int getWorkingNumberOfYear() {
		return workingNumberOfYear;
	}

	public void setWorkingNumberOfYear(int workingNumberOfYear) {
		this.workingNumberOfYear = workingNumberOfYear;
	}

	public Employee() {
	}

}
