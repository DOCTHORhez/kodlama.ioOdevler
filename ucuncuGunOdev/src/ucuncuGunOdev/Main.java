package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) 
	{
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Hasan Emre");
		student1.setLastName("ZEYREK");
		student1.setEmail("hasanemrezeyrek@gmail.com");
		student1.setUserName("HEZ");
		student1.setStudentNumber("277");
		
		Student student2 = new Student();
		student2.setId(1);
		student2.setFirstName("Emre Hasan");
		student1.setLastName("ZEYREK");
		student1.setEmail("emrehasanzeyrek@gmail.com");
		student1.setUserName("EHZ");
		student1.setStudentNumber("727");
		
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.view(student1);
		studentManager.view(student2);
		
		
		Instructor ınstructor1 = new Instructor();
		ınstructor1.setId(0);
		ınstructor1.setFirstName("Engin");
		ınstructor1.setLastName("Demirog");
		ınstructor1.setEmail("engindemirog@gmail.com");
		ınstructor1.setUserName("Egndmrog");
		ınstructor1.setBranch("Java");
		
		InstructorManager ınstructorManager  = new InstructorManager();
		ınstructorManager.courseAdd(ınstructor1);
		ınstructorManager.courseDelete(ınstructor1);
		
		
		
		

	}

}
