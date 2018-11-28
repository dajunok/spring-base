package liu.wiring.autowiring.Bean;

/**
 * 家庭成员
 * @author LIU
 *
 */
public class Member {
	private String name;
	
	public Member(String name) {
		this.name=name;
		System.out.println("家庭成员...");
	}

	public String getName() {
		return this.name;
	}

}
