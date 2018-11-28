package liu.wiring.autowiring.Ambiguity;

/**
 * 学生
 * @author LIU
 *
 */
public class Student {
	private String name;
	
	public Student(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
}
