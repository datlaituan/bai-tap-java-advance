package com.vti;

import java.util.ArrayList;
import java.util.List;

import com.vti.dto.DepartmentDTO;
import com.vti.entity.Department;
import com.vti.repository.DepartmentRepository;

public class Program {
	static DepartmentRepository repository = new DepartmentRepository();

	public static void main(String[] args) {
//		createDepartment();
		getAllDepartment();
//		getDepartmentById();
//		getAllDepartmentByName();
//		deleteDepartment();
//		checkDepartmentExist();
	}

	public static void createDepartment() {
		Department department = new Department(15, "dat ");
		repository.createGroups(department);

		System.out.println(department);
	}

	public static void getAllDepartment() {

		List<DepartmentDTO> dtos = repository.getAllDepartment(1, 1, "marketing", (short) 2);
		for (DepartmentDTO departmentDTO : dtos) {
			System.out.println(departmentDTO);
		}
		System.out.println(1);
	}

	public static void getDepartmentById() {
		List<Department> departments = repository.getDepartmentById();
		for (Department department : departments) {
			System.out.println(department);

		}
	}

	public static void getAllDepartmentByName() {
		Department department = repository.getAllDepartmentByName("marketing");
		System.err.println(department);
	}

	public static void deleteDepartment() {
		repository.deleteDepartment(1);
		System.out.println("da xoa");

	}

	public static void checkDepartmentExist() {
		repository.checkDepartmentExist(5);

	}

}
