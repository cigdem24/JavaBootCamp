package day3;

public class StudentManager extends UserManager {

	public void addCourse(User user, Course course) {
		System.out
				.println(" Öğrenci : " + user.getFullName() + " " + course.courseName + "eğitimini kurslarına ekledi.");
	}

	public void doneHomework(Student student, Course course) {
		System.out.println(student.getFullName() + " öğrenci " + course.courseName + " kursunun ödevlerini tamamladı.");
	}

}
