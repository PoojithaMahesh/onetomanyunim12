package onetomanyunim12.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetomanyunim12.dto.Company;
import onetomanyunim12.dto.Employee;

public class EmployeeDao {
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	public void saveEmployee(int companyId,Employee employee) {
	EntityManager entityManager=getEntityManager();
	Company dbCompany=entityManager.find(Company.class, companyId);
	if(dbCompany!=null) {
//		it is a valid company
//		then employee can join to that company
		EntityTransaction  entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
//		i need to update company deatils also
		List<Employee> employees=dbCompany.getEmployees();
//		inside this employees im having old employees list
//		now im going to add new employee into that list
		employees.add(employee);
//		this employees is having both old emps and new emp(mhd)
		dbCompany.setEmployees(employees);
		entityManager.merge(dbCompany);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry id is not present");
	}
	}
}
