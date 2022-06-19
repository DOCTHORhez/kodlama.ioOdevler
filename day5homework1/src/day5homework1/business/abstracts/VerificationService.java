package day5homework1.business.abstracts;

public interface VerificationService {
	void sendToVerififyMail(String email);
	void verifyMail(String email);
	boolean checkVerifyAccount(String email);

}
