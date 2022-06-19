package day5homework1.dataAccess.abstracts;

import java.util.List;

import day5homework1.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean getGmail(String email);
	boolean getPassword(String password);
	List<User> getAll();

}
