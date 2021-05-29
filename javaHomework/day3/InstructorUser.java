package day3;

public class InstructorUser extends User {

	String resume;
	Course[] myCourses;

	public InstructorUser(int id, String fullName, String emailAdress, String password, String resume) {
		super(id, fullName, emailAdress, password);
		this.resume = resume;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public void getMyCourses() {

		int i = 0;
		for (Course course : myCourses) {
			System.out.println(i + ".Eğitimim: " + course.courseName);
			i++;
		}
	}

}
