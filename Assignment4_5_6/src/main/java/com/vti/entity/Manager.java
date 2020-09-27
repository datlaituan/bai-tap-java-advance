package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Manager", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "AccountID")
public class Manager extends Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "ManagementNumberOfYear")
	private int managementNumberOfYear;

	public int getManagementNumberOfYear() {
		return managementNumberOfYear;
	}

	public void setManagementNumberOfYear(int managementNumberOfYear) {
		this.managementNumberOfYear = managementNumberOfYear;
	}

	public Manager() {
	}

}
