package liu.wiring.autowiring.Ambiguity;

/**
 * 教师
 * @author LIU
 *
 */
public class Teacher {
	private String name;
	
	public Teacher(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

}
