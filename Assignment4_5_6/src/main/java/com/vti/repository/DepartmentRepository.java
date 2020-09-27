package com.vti.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import com.vti.dto.DepartmentDTO;
import com.vti.entity.Department;
import com.vti.entity.DetailDepartment;
import com.vti.utils.HibernateUtils;

public class DepartmentRepository {
	private HibernateUtils hibernateUtils;

	public DepartmentRepository() {
		hibernateUtils = new HibernateUtils();
	}

	public void createGroups(Department department) {

		Session session = null;
		try {
			session = hibernateUtils.openSession();

			session.save(department);
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings("deprecation")
	public List<DepartmentDTO> getAllDepartment(int pageNumber, int pageSize, String fieldName, short emulationPoint) {

		Session session = null;
		List<DepartmentDTO> dtos = new ArrayList<DepartmentDTO>();
		try {
			// get session
			session = hibernateUtils.openSession();

			// criteria
			Criteria criteria = session.createCriteria(DetailDepartment.class);

			if (fieldName != null) {
				Criterion searchName = Restrictions.eq("departmentName", fieldName);
				criteria.add(searchName);
			}

			if (emulationPoint > 0) {
				Criterion record = Restrictions.gt("emulationPoint", emulationPoint);
				criteria.add(record);
			}

			criteria.addOrder(Order.asc("departmentName"));
			criteria.setFirstResult(pageNumber);
			criteria.setMaxResults(pageSize);
			List<DetailDepartment> detailDepartments = criteria.list();
			for (DetailDepartment detailDepartment : detailDepartments) {
				dtos.add(new DepartmentDTO(detailDepartment));
			}
			return dtos;
		} finally {
			if (session != null) {
				session.close();
			}
		}

	}

	public List<Department> getDepartmentById() {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("From Department Where DepartmentID = 5");
			return query.list();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	public Department getAllDepartmentByName(String departmentName) {
		Session session = null;
		try {
			session = hibernateUtils.openSession();
			Query<Department> query = session.createQuery("FROM Department WHERE DepartmentID = :nameParameter");
			query.setParameter("nameParameter", departmentName);
			Department department = query.uniqueResult();
			return department;

		} finally {
			if (session != null)
				session.close();
		}
	}

	public void deleteDepartment(int departmentId) {
		Session session = null;
		try {
			hibernateUtils.openSession();
			session.beginTransaction();
			Department department = (Department) session.load(Department.class, departmentId);
			session.delete(department);
			session.getTransaction().commit();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public boolean checkDepartmentExist(int departmentId) {
		Session session = null;

		hibernateUtils.openSession();
		Department department = session.load(Department.class, departmentId);
		if (department == null) {
			return false;
		}
		return true;
	}
}
