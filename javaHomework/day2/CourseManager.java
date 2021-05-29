package day2;

public class CourseManager {
	
	
	
	public  void percentegateOfCompletion(Course course) {
		
		System.out.println(course.courseName+" Kursu % "+course.percentageOfCompletion+" tamamlandı.\n");
	}
	
	public void attendanceButton(Course course) {
		
		System.out.println("Yoklamanız alındı.");
		course.percentageOfCompletion = course.percentageOfCompletion+5;
	
	}
}