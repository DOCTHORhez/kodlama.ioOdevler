package ikinciGunOdevi;

public class Main {

	public static void main(String[] args) 
	{
		Course course1 = new Course();
		course1.id=1;
		course1.courseName="C# + ANGULAR";
		course1.teacher="Engin Demirog";
		course1.duration=21;
		
		Course course2 = new Course(2,"JAVA + REACT","Engin Demirog",14);
		
		Course[] Courses = {course1,course2};
		
		for (Course courses : Courses) 
		{
			System.out.println(courses.id);
			System.out.println(courses.courseName);
			System.out.println(courses.teacher);
			System.out.println(courses.duration);
			System.out.println("--------------------");
		}
		
		CourseManager courseManager=new CourseManager();
		courseManager.programaDahilOL(course1);
		courseManager.programdanCık(course2);
		

	}

}
