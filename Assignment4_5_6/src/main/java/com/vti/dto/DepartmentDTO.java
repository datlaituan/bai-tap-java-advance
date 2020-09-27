package com.vti.dto;

import com.vti.entity.Address;
import com.vti.entity.Department;
import com.vti.entity.DetailDepartment;

public class DepartmentDTO {

	private String nameDepartment;
	private short emulationPoint;
	private Address addressName;

	public short getEmulationPoint() {
		return emulationPoint;
	}

	public void setEmulationPoint(short emulationPoint) {
		this.emulationPoint = emulationPoint;
	}

	public Address getAddressName() {
		return addressName;
	}

	public void setAddressName(Address addressName) {
		this.addressName = addressName;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}

	public DepartmentDTO() {
	}

	public DepartmentDTO(Department department) {
		this.nameDepartment = department.getDepartmentName();
	}

	public DepartmentDTO(DetailDepartment detailDepartment) {
		this.nameDepartment = detailDepartment.getDepartmentName();
		this.emulationPoint = detailDepartment.getEmulationPoint();
		this.addressName = detailDepartment.getAddress();
	}

	@Override
	public String toString() {
		return "DepartmentDTO [nameDepartment=" + nameDepartment + "]";
	}

}
