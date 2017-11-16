package springboot.hibernate.jpa.example.service;

import java.util.List;

public interface DatabaseService {

	public String getVersion();
	public List<String> showDatabases();
}
