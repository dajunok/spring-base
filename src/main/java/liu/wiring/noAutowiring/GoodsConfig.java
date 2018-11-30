package liu.wiring.noAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 商品配置类
 * @author LIU
 *
 */
@Configuration
public class GoodsConfig {
	@Bean("G-Apple")
	public Goods gApple() {return new Goods("苹果", "斤", 8.50, "水果");}
	
	@Bean("G-Pear")
	public Goods gPear() {return new Goods("梨", "斤", 4.50, "水果");}
	
	@Bean("G-Banana")
	public Goods gBanana() {return new Goods("香蕉", "斤", 2.50, "水果");}

}
