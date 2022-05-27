package ucuncuGunOdev;

public class StudentManager extends UserManager
{
	public void view(Student student)
	{
		System.out.println("students course viewed "+student.getFirstName());
	}

}
