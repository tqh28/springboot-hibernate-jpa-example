package springboot.hibernate.jpa.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springboot.hibernate.jpa.example.service.DatabaseService;
import springboot.hibernate.jpa.example.service.EmployeeService;
import springboot.hibernate.jpa.example.serviceImpl.DatabaseServiceImpl;
import springboot.hibernate.jpa.example.serviceImpl.EmployeeServiceImpl;

@Configuration
public class AppConfiguration {

	@Bean
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl();
	}
	
	@Bean
	public DatabaseService getDatabaseService() {
		return new DatabaseServiceImpl();
	}
}
