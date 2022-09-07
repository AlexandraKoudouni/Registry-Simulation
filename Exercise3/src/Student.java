
public class Student {

	private String name ;
	private String id;
	private Course myCourse;
	
	public Student(String name , String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public Course getMyCourse() {
		return myCourse;
	}
	
	public void setMyCourse(Course myCourse) {
		this.myCourse = myCourse;
	}

	public void printInfo() {
		System.out.println("Name of student: " + name);
		System.out.println("Id of student: " + id);
	}
}
