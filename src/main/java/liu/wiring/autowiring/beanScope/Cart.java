package liu.wiring.autowiring.beanScope;


import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * 购物车
 * @author LIU
 *
 */

@Component("cart")
@Scope(value="singleton",proxyMode =ScopedProxyMode.TARGET_CLASS)
public class Cart {
	public void  addGoods() {
		System.out.println("添加商品");
	}
	
}
