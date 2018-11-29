package liu.wiring.autowiring.Condition;

/**
 * 宠物狗
 * @author LIU
 *
 */
public class Dog extends Animal {
	//宠物名
	private String petName;
	
	public Dog() {}
	
	public Dog(String petName) {
		this.petName=petName;		
	}
	
	public String getPetName() {
		return this.petName;
	}

}
