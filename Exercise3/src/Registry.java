import java.util.*;

public class Registry {

	private String name;
	private ArrayList<Course> courses = new ArrayList<>();
	
	public Registry(String name) {
		this.name = name;
	}
	
	public void addCourse(Course c) {
		courses.add(c);
	}
	
	public void printCourses() {
		System.out.println("=======Courses of " + name + "=======");
		for(int i = 0 ; i < courses.size() ; i++) {
			System.out.println("-Name: " + courses.get(i).getName() + " Location: " + courses.get(i).getMyClassRoom().getLocation());
			courses.get(i).printEnrolledStudents();
		}
	}
}
