package oopsconcepts;
class StudentsReg
{
	private int stdid;
	private String studentName;
	private String course;
	
	//Go to Source--> generate getters and Setters
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		StudentsReg obj=new StudentsReg();
		obj.setStdid(1);
		obj.setStudentName("Athira");
		obj.setCourse("IT");
		System.out.println(obj.getStdid());
		System.out.println(obj.getStudentName());
		System.out.println(obj.getCourse());
		
	}

}
