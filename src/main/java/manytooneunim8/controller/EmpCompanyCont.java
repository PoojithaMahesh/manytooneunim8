package manytooneunim8.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim8.dao.CompanyDao;
import manytooneunim8.dao.EmployeeDao;
import manytooneunim8.dto.Company;
import manytooneunim8.dto.Employee;

public class EmpCompanyCont {
public static void main(String[] args) {
//	Company company=new Company();
//	company.setId(1);
//	company.setName("TYSS");
//	company.setGst("tyss@123");
//	
//	Employee employee1=new Employee();
//	employee1.setId(1);
//	employee1.setName("karthi");
//	employee1.setAddress("Chennai");
//	
//	employee1.setCompany(company);
//	
//	Employee employee2=new Employee();
//	employee2.setId(2);
//	employee2.setName("Prem");
//	employee2.setAddress("AP");
//	
//	employee2.setCompany(company);
//	
//	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
//	EntityManager entityManager=entityManagerFactory.createEntityManager();
//	EntityTransaction entityTransaction=entityManager.getTransaction();
//	entityTransaction.begin();
//	entityManager.persist(company);
//	entityManager.persist(employee1);
//	entityManager.persist(employee2);
//	entityTransaction.commit();
//	
	
	Employee employee1=new Employee();
	employee1.setName("karthikeyan");
	employee1.setAddress("Chennai");
	
//	Company company=new Company();
//	company.setName("TestYantra");
//	company.setGst("tyss@123");
//	
//	CompanyDao companyDao=new CompanyDao();
//	companyDao.updateCompany(1, company);
	
	
//	EmployeeDao employeeDao=new EmployeeDao();
//	employeeDao.updateEmployee(1, employee1);
	
	CompanyDao companyDao=new CompanyDao();
	companyDao.deleteCompany(1);
	
//	EmployeeDao dao=new EmployeeDao();
//	dao.deleteEmployee(2);
}
}
