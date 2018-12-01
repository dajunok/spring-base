package liu.wiring.noAutowiring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * 购物车配置类
 * @author dajun
 *
 */
@Configuration
@ImportResource(locations="classpath:/liu/wiring/noAutowiring/spring-goods.xml")
public class ShoppingGartConfig {
	@Autowired
	@Qualifier("G-Apple")
	private Goods gApple;  //苹果
	
	@Autowired
	@Qualifier("G-Pear")
	private Goods gPear;   //梨
	
	@Autowired
	@Qualifier("G-Banana")
	private Goods gBanana;   //梨
	
	
	@Bean("shop-001")
	public ShoppingCart cart001() {
		List<Goods> goodlist= new ArrayList<Goods>();
		goodlist.add(gApple); 
		goodlist.add(gPear);
		goodlist.add(gBanana);		
		return new ShoppingCart("0001", "001", goodlist);
	}
}
