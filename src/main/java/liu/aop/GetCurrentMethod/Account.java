package liu.aop.GetCurrentMethod;

/**
 * 公司账户
 * @author LIU
 *
 */
public class Account {
	private String id;     //账户ID
	private double amount;  //金额
	
	
	public Account(String id, double amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public double getAmount() {
		return amount;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	
}
