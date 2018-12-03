package liu.aop.xml;


/**
 * 订单
 * @author LIU
 *
 */
public class Order {
	private String orderID;  //订单编号
	private String status;   //订单状态
	private double amount;   //订单金额
	
	public Order(String orderID, String status, double amount) {
		super();
		this.orderID = orderID;
		this.status = status;
		this.amount = amount;
	}

	public String pay() {
		System.out.println("订单编号： "+this.orderID+"\n"+"订单金额： "+this.amount+"\n"+"订单状态： "+this.status);
		return this.status;
	}
	
	public String pay(String customer,String address)  //传入顾客姓名、年龄
	{ 
		
		System.out.println("顾客姓名："+customer+"     "+"顾客地址："+address);
		return this.status;
	}
	
	public double pay(String customer,Integer age ) throws OrderException //传入顾客姓名、地址
	{		 
		if(age>45) {
			throw new OrderException("订单异常：顾客年龄太大！！"); //抛出自定义订单异常
		}				
		System.out.println("顾客姓名："+customer+"     "+"顾客年龄："+age);
		return this.amount;
	}
}
