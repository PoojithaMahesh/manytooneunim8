package manytooneunim8.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneunim8.dto.Company;

public class CompanyDao {

	public EntityManager getEntityManager() {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	return entityManager;
			
	} 
	
	public void updateCompany(int id,Company company) {
		
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			that id is present
			EntityTransaction entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			company.setId(id);
			entityManager.merge(company);
			entityTransaction.commit();
		}else {
			System.out.println("Sorry id is not present");
		}
				
	}
	
public void findCompany(int id) {
		EntityManager entityManager=getEntityManager();
		Company dbCompany=entityManager.find(Company.class, id);
		if(dbCompany!=null) {
//			that id is present
			System.out.println(dbCompany);
		}else {
			System.out.println("Sorry id is not present");
		}			
	}
public void deleteCompany(int id) {
	
	EntityManager entityManager=getEntityManager();
	Company dbCompany=entityManager.find(Company.class, id);
	if(dbCompany!=null) {
//		that id is present
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(dbCompany);
		entityTransaction.commit();
	}else {
		System.out.println("Sorry id is not present");
	}
			
}
	
}
