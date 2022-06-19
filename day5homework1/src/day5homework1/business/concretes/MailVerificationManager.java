package day5homework1.business.concretes;

import java.util.List;
import java.util.ArrayList;

import day5homework1.business.abstracts.VerificationService;

public class MailVerificationManager implements VerificationService{

	UserCheckManager UserCheckManager;
	List<String> verificatedEmails = new ArrayList<String>();
	
	@Override
	public void sendToVerififyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(email+"dogrulandı");
		
	}

	@Override
	public void verifyMail(String email) {
		System.out.println(email+"dogrulama maili gönderildi.");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email))
		{
			return true;
		}
		return false;
	}

}
