package liu.wiring.noAutowiring;

/**
 * 顾客
 * @author LIU
 *
 */
public class Customer {
	private String id;      //唯一确定顾客
	private String name;    //顾客姓名
	private String mobile;  //移到电话
	
	public Customer(String id, String name, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMobile() {
		return mobile;
	}
	
	
}
