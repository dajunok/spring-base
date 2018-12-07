package liu.aop.GetCurrentMethod;
/**
 * 公司
 * @author LIU
 * Account：公司账户
 */

public class Company {
	private String name;         //简称
	private String fullName;     //公司全称
	private String address;      //地址
	private String corporation;  //公司法人
	private double registerFunds;  //注册资金
	
	public Company(String name, String fullName, String address, String corporation, double registerFunds) {
		super();
		this.name = name;
		this.fullName = fullName;
		this.address = address;
		this.corporation = corporation;
		this.registerFunds = registerFunds;
	}
	public String getName() {
		return name;
	}
	public String getFullName() {
		return fullName;
	}
	public String getAddress() {
		return address;
	}
	public String getCorporation() {
		return corporation;
	}
	public double getRegisterFunds() {
		return registerFunds;
	}
	
	@Safety("安全账户")
	public double payment(Account account,double money) throws AccountException {
		double sum=account.getAmount()+money;
		if(sum<100000) {
			throw new AccountException("账户异常：现金流短缺！！");
		}		
		System.out.println("    公司账户总额："+sum);
		return sum;
	}
	
}
