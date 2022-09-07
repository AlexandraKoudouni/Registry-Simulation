import java.util.*;
public class Course {

	private String name;
	private int credits;
	private ArrayList<Student> enrolledStudents = new ArrayList<>();
	private ClassRoom myClassRoom;
	
	public Course(String name , int credits) {
		this.name = name;
		this.credits = credits;
	}

	public String getName() {
		return name;
	}

	public int getCredits() {
		return credits;
	}
	
	public ArrayList<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public ClassRoom getMyClassRoom() {
		return myClassRoom;
	}
	
	public void addStudent(Student student) {
		if(myClassRoom.getCapacity() > enrolledStudents.size()) {
			enrolledStudents.add(student);
			student.setMyCourse(this);
		}
		else
			System.out.println("The capacity of the course is not enough!");
	}
	
	public void printEnrolledStudents(){
		for( int i=0 ; i < enrolledStudents.size() ; i++) {
			System.out.println(" ====The enrolled students of the course " + name + " are====");
			System.out.println("     " + (i+1) + ". Name:" + enrolledStudents.get(i).getName() + " Id: " + enrolledStudents.get(i).getId());
		}
	}
	
	public void chageClassRoom(ClassRoom c){
		myClassRoom = c;
	}
	
	public void printClassRoom(){
		System.out.println("The classroom of the course " + name + " is " + myClassRoom.getLocation());
	}
}
