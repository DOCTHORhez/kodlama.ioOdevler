package day5homework1.dataAccess.concretes;

import java.util.List;
import java.util.ArrayList;
import day5homework1.dataAccess.abstracts.UserDao;
import day5homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	@Override
	public void add(User user) {
		System.out.println("hibernate added"+user.getFirstName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println("hibernate updated"+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("hibernate deleted"+user.getFirstName());
		
	}

	@Override
	public boolean getGmail(String email) {
		
		for(User userss : users)
		{
			if(userss.getGmail() == email)
			{
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		
		for(User users : users)
		{
			if(users.getPassword()== password)
			{
				return true;
			}
		}
		
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
