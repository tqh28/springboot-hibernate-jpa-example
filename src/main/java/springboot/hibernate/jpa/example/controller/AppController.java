package springboot.hibernate.jpa.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.hibernate.jpa.example.service.DatabaseService;

@RestController
public class AppController {
	
	@Autowired
	private DatabaseService databaseService;

	@RequestMapping("/")
	public String getDetail() {
		return databaseService.getVersion();
	}
	
	@RequestMapping("/database-version")
	public List<String> showDatabases() {
		return databaseService.showDatabases();
	}
}
