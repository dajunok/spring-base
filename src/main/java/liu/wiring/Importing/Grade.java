package liu.wiring.Importing;

/**
 * 工资级别
 * @author LIU
 *
 */
public class Grade {
	private String gradeName;
	
	public Grade(String gradeName) {
		this.gradeName=gradeName;
	}

	public String getName() {
		return this.gradeName;
	}
}
