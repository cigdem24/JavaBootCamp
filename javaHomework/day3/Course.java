package day3;

public class Course {

	int id;
	String courseName;
	String instructor;

	public Course(int id, String courseName, InstructorUser instructorUser) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.instructor = instructorUser.getFullName();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorUser instructorUser) {
		this.instructor = instructorUser.getFullName();
	}

}
