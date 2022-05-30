package dorduncuGün_birinciOdev;

public class BaseCustomerManager implements CustomerService
{

	@Override
	public void save(Customer customer) 
	{
		System.out.println("saved to databse"+customer.getFirstName());
	}

}
