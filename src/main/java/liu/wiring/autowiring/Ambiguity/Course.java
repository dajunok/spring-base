package liu.wiring.autowiring.Ambiguity;


/**
 * 学校课程
 * @author LIU
 *
 */
public class Course {
	private String courseName;
	private Teacher teacher;
	private Student student;
	
	public Course(String courseName,Teacher teacher,Student student) {
		this.courseName=courseName;
		this.teacher=teacher;
		this.student=student;		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Course Name: "+this.courseName+"\n"+"Teacher: "+this.teacher.getName()+"\n"+"Student: "+this.student.getName();
	}

}
