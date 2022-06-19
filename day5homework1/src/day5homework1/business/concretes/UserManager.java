package day5homework1.business.concretes;

import day5homework1.business.abstracts.UserCheckService;
import day5homework1.business.abstracts.UserService;
import day5homework1.business.abstracts.VerificationService;
import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class UserManager implements UserService{
	
	UserCheckService userCheckService;
	VerificationService verificationService;
	UserDao userDao;

	
	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
	}

	@Override
	public void signUp(User user) {
		
		if (userCheckService.isValid(user)==true) {
			System.out.println("Sisteme kullanıcı eklenmiiştir "+user.getFirstName());
			verificationService.sendToVerififyMail(user.getGmail());
			userDao.add(user);
		}
	}

	@Override
	public void signIn(User user) {
		
		verificationService.verifyMail(user.getGmail());
		
		if(userDao.getPassword(user.getGmail()) && userDao.getPassword(user.getPassword()) && verificationService.checkVerifyAccount(user.getGmail()))
		{
			System.out.println("kullanıcı girişi başrılı ");
		}
		else if(verificationService.checkVerifyAccount(user.getGmail())== false)
		{
			System.out.println("Mail Doğrulaması yapın !!! ");
		}
		else 
		{
		    System.out.print("hatalı giriş");	
		}
		
	}

}
