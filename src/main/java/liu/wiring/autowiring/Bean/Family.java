package liu.wiring.autowiring.Bean;

/**
 * 家庭
 * @author LIU
 *
 */
public class Family {
	private Member member;

	public Family(Member member) {
		this.member=member;
		System.out.println("好家庭...");
	}

	public Family() {
		System.out.println("我的家庭...");
	}
	
	public void familyMember() {
		System.out.println("我的朋友："+this.member.getName());
	}

}
