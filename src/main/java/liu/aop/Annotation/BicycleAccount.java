package liu.aop.Annotation;

/**
 * 共享单车账户
 * @author LIU
 *
 */
public class BicycleAccount {
	private String id;  //账户ID
	private float amount;  //账户余额
	
	public BicycleAccount(String id, float amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float money) {
		this.amount=money;
		
	}
	
}
