package liu.wiring.Importing;

/**
 * 职员
 * @author LIU
 *
 */
public class Employee {
	private String name;	
	private Post post;
	private Grade grade;
	private Department department;
	private Office office;
	
	public Employee() {}
	public Employee(String name,Post post,Grade grade,Department department,Office office) {
		this.name=name;
		this.post=post;
		this.grade=grade;
		this.department=department;
		this.office=office;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPost() {
		return this.post.getName();
	}
	
	public String getGrade() {
		return this.grade.getName();
	}
	
	public String getDepartment() {
		return this.department.getName();
	}
	
	public String getOffice() {
		return this.office.getName();
	}

}
