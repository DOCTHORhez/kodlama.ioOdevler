package day5homework1.business.abstracts;

import day5homework1.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);

}
