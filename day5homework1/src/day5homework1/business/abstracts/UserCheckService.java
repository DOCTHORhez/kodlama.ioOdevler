package day5homework1.business.abstracts;

import day5homework1.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmail(User user);
	boolean checkPassword(User user);
	boolean uniqueEmail(User user);
	boolean isValid(User user);

}
