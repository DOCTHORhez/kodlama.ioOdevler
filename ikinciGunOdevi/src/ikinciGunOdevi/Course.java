package ikinciGunOdevi;

public class Course 
{
	public Course() 
	{
	   System.out.println("Calisti.");	
	}
	
	public Course(int id, String courseName , String teacher , int duraction) 
	{
		this();
		this.id=id;
		this.courseName=courseName;
		this.teacher=teacher;
		this.duration=duraction;
	}
	
	
	int id;
	String courseName;
	String teacher;
	int duration;

}
