package day5homework1.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import day5homework1.business.abstracts.UserCheckService;
import day5homework1.entities.concretes.User;

public class UserCheckManager implements UserCheckService{

	List<String> listOfEmail = new ArrayList<String>();
	@Override
	public boolean checkFirstName(User user) {
		
		if(user.getFirstName().isEmpty())
		{
			System.out.println("isim alanı boş bırakılamaz");
			return false;
		}
		else 
		{
		   if(user.getFirstName().length() <3)
		   {
			   System.out.println("isim 2 karakterden küçük olamaz !! ");
			   return false;
		   }
		}
		return true;
	}

	@Override
	public boolean checkLastName(User user) {
		
		if(user.getLastName().isEmpty())
		{
			System.out.println("Soyad boş geçilemez !!");
			return false;
		}
		else 
		{
			if(user.getLastName().length() < 3) 
			{
				System.out.print("Soyad 3 karakterden az olamz !");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkEmail(User user) {
		
		String regex ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern=Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
		
		if(user.getGmail().isEmpty())
		{
			System.out.println("Email alanı boş kalamaz ");
			return false;
		}
		else
		{
			if(pattern.matcher(user.getGmail()).find() == false)
			{
				System.out.print("Girilen email adresi formata uygun değildir ");
				return false;
			}
		}
		
		return true;
	}

	@Override
	public boolean checkPassword(User user) {
		
		if(user.getPassword().isEmpty())
		{
			System.out.println("Sifre alanı bos gecilemez");
			return false;
		}
		else 
		{
		   if(user.getPassword().length() < 6 ) 
		   {
			   System.out.println("Parola 6 karakterden daha küçük olamaz ");
			   return false;
		   }	
		}
		return true;
	}

	@Override
	public boolean uniqueEmail(User user) {
		
		boolean result = true;
		
		if(listOfEmail.contains(user.getGmail()))
		{
			System.out.println("Bu mail aadresi ile sisteme daha önce kayıt olunmuştur");
			result = false;
		}
		else 
		{
			result=true;
			listOfEmail.add(user.getGmail());
		}
		return result;
	}

	@Override
	public boolean isValid(User user) {
		
		if(checkFirstName(user) && checkLastName(user) && checkEmail(user) && checkPassword(user) && uniqueEmail(user))
		{
			return true;
		}
		return false;
	}

}
