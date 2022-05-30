package dorduncuGün_birinciOdev;

public class Customer 
{

	private int id;
	private String firstName;
	private String lasstName;
	private String dateOfBirth;
	private String nationalityId;
	
	
	public Customer(int id, String firstName, String lasstName, String dateOfBirth, String nationalityId) 
	{
		this.id = id;
		this.firstName = firstName;
		this.lasstName = lasstName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLasstName() {
		return lasstName;
	}


	public void setLasstName(String lasstName) {
		this.lasstName = lasstName;
	}


	public String getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
}
