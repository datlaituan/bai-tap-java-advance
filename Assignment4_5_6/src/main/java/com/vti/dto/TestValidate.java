package com.vti.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class TestValidate {
	private int id;
	@Size(min = 5, max = 50, message = "ko dc qua 50")
	private String name;
	@Min(value = 0, message = "it nhat la 0")
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

	@Override
	public String toString() {
		return "TestValidate [id=" + id + ", name=" + name + ", totalMember=" + totalMember + "]";
	}

	public TestValidate() {
	}

}
