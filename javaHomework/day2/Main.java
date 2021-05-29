package day2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("**** ÖZELLİK CLASSI ÖRNEK ****\n");
		
		Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı C# + ANGULAR","Engin Demiroğ", 30);
		
		Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı JAVA + REACT","Engin Demiroğ", 50);
		
		Course course3 = new Course(3,"Programlaya Giriş İçin Temel Kurs","Engin Demiroğ", 0);
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses)
		{
			System.out.println("Kurs 1: "+ course.courseName  + "\nEğitmeni: "+course.insructor+"\nTamamlanma Yüzdesi: "+course.percentageOfCompletion+"\n--------------" );
		}
		
		System.out.println("\n**** İŞ CLASSI ÖRNEK ****\n");
		
		CourseManager courseManager = new CourseManager();
		
		for(Course course : courses) {
			
			courseManager.attendanceButton(course);
			courseManager.percentegateOfCompletion(course);
		}
		
		
		
		

	}

}
