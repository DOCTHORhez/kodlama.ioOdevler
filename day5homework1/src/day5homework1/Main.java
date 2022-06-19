package day5homework1;

import day5homework1.business.concretes.MailVerificationManager;
import day5homework1.business.concretes.UserCheckManager;
import day5homework1.business.concretes.UserManager;
import day5homework1.dataAccess.concretes.HibernateUserDao;
import day5homework1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		User user0 = new User();
		user0.setUserId(1);
		user0.setFirstName("Hasan Emre");
		user0.setLastName("ZEYREK");
		user0.setLastName("hasanemrezeyrek@gmail.com");
		user0.setPassword("000000");
		
		User user1 = new User();
		user1.setUserId(2);
		user1.setFirstName("Hasan Emre");
		user1.setLastName("ZEYREK");
		user1.setLastName("hasanemrezeyrek@gmail.com");
		user1.setPassword("000000");
		
		UserManager customerManager = new UserManager(new UserCheckManager(), new MailVerificationManager(), new HibernateUserDao());
		customerManager.signIn(user0);
		//customerManager.signIn(user1);
		
		//customerManager.signUp(user0);
		//customerManager.signUp(user1);
	}

}
