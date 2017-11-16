package springboot.hibernate.jpa.example.serviceImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import springboot.hibernate.jpa.example.JPAUtil;
import springboot.hibernate.jpa.example.service.DatabaseService;

public class DatabaseServiceImpl implements DatabaseService {
	
	private EntityManager entityManager;
	
	public DatabaseServiceImpl() {
		EntityManagerFactory entityManagerFactory = JPAUtil.getEntityManagerFactory();
		entityManager = entityManagerFactory.createEntityManager();
	}

	@Override
	public String getVersion() {
		String res = (String) entityManager.createNativeQuery("select version()").getSingleResult();
		return res;
	}
	
	@Override
	public List<String> showDatabases() {
		List<String> list = entityManager.createNativeQuery("show databases").getResultList();		
		return list;
	}
}
