package day3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(0);
		student.setFullName("Çiğdem Atak");
        student.setEmailAdress("cigdem@atak.com");
        student.setPassword("12456");
        
        
		InstructorUser enginInstructorUser = new InstructorUser(1, "Engin Demiroğ", "engin@demirog.com", "123456",
				"DevFramework ismiyle geliştirdiğim  altyapı projem birçok kurum ve firmada yazılım geliştirme altyapısı olarak kullanılmaktadır.");

		Course course = new Course(0, "Java + React Kursu", enginInstructorUser);
		Course course1 = new Course(1, "C# + Angular Kursu", enginInstructorUser);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signIn(enginInstructorUser);
		instructorManager.profileEdit(enginInstructorUser);
		instructorManager.addCourse(enginInstructorUser, course1);
		instructorManager.addHomework(enginInstructorUser, course);

	}

}
