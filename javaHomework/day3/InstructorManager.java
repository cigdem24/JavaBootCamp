package day3;

public class InstructorManager extends UserManager {

	public void addCourse(User user, Course course) {
		System.out.println("Eğitmen : " + user.getFullName() + " " + course.courseName + " eğitimini ekledi.");
	}

	public void addHomework(InstructorUser instructorUser, Course course) {
		System.out.println("Eğitmen : " + instructorUser.getFullName() + course.courseName + " kursuna ödev ekledi.");
	}

}
