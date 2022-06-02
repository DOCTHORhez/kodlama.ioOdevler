package dortGun_ucuncuOdev;



public class Gamer implements Entity //boş kalmasın diye entity oluşturup implement yaptım
{
   private int id;
   private String firstName;
   private String lastName;
   private String nationalityId;
   private String dateofBirth;
   
    public Gamer()
    {
	   
    }
   
   
    public Gamer(int id, String firstName, String lastName, String nationalityId, String dateofBirth) 
    {
	this();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalityId = nationalityId;
	this.dateofBirth = dateofBirth;
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


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public String getDateofBirth() {
		return dateofBirth;
	}


	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
   
   
}
