package liu.wiring.noAutowiring;

import java.util.List;

/**
 * 购物车
 * @author LIU
 *
 */
public class ShoppingCart {
	private String customerID;  //对应顾客ID号
	private String number;   //购物车编号
	private List<Goods> goodsList;  //商品列表
	
	public ShoppingCart(String customerID, String number, List<Goods> goodsList) {
		super();
		this.customerID = customerID;
		this.number = number;
		this.goodsList = goodsList;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getNumber() {
		return number;
	}

	public List<Goods> getGoodsList() {
		return goodsList;
	}

}
