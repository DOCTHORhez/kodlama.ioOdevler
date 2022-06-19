package day5homework1.core;

import java.util.ArrayList;
import java.util.List;

import day5homework1.business.abstracts.VerificationService;

public class GoogleLognAdapter implements VerificationService{

	List<String> verificatedEmails = new ArrayList<String>();
	@Override
	public void sendToVerififyMail(String email) {
		
		System.out.println(email + "dogrulama maili gönderildi");
	}

	@Override
	public void verifyMail(String email) 
	{
		verificatedEmails.add(email);
		System.out.println(email + "dogrulandı");
		
		
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
