package dorduncuGün_birinciOdev;

public class Main {

	public static void main(String[] args)
	{
      BaseCustomerManager customerManager = new StarbucksCustomerManager();
      customerManager.save(new Customer(1,"hasan","zeyrek","2002","TR"));
	}

}
