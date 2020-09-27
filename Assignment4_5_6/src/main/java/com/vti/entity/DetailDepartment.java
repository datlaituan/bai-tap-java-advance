package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "DetailDepartment", catalog = "TestingSystem")
@PrimaryKeyJoinColumn(name = "DepartmentID")
public class DetailDepartment extends Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "AddressID", referencedColumnName = "AddressID")
	private Address address;

	@Column(name = "EmulationPoint")
	private short emulationPoint;

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the emulationPoint
	 */
	public short getEmulationPoint() {
		return emulationPoint;
	}

	/**
	 * @param emulationPoint the emulationPoint to set
	 */
	public void setEmulationPoint(short emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	public DetailDepartment() {
	}

	@Override
	public String toString() {
		return "DetailDepartment [emulationPoint=" + emulationPoint + "]";
	}

}
