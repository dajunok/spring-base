package liu.wiring.noAutowiring;

import java.util.List;

/**
 * 订货单
 * @author LIU
 *
 */
public class OrderForm {
	public String orderID;         //订单ID	
	public int status;  //订单状态
	public List<Goods> goodslist;  //商品列表
	
	public OrderForm(String orderID, int status,List<Goods> goodslist) {
		super();
		this.orderID = orderID;
		this.goodslist = goodslist;
		this.status = status;
	}

	public String getOrderID() {
		return orderID;
	}

	public List<Goods> getGoodslist() {
		return goodslist;
	}

	public int getStatus() {
		return status;
	}
	
}
