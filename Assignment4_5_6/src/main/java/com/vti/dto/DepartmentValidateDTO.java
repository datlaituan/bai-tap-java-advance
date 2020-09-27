package com.vti.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class DepartmentValidateDTO {
	private int id;

	@Size(min = 6, max = 50, message = "name min is 6 and max is 50")
	private String name;

	@Min(value = 0, message = "total member required greater than 0 or equal 0")
	private int totalMember;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalMember() {
		return totalMember;
	}

	public void setTotalMember(int totalMember) {
		this.totalMember = totalMember;
	}

}
