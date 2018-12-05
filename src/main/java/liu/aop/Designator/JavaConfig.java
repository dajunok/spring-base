package liu.aop.Designator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类：主要用于定义bean。
 * @author LIU
 *
 */

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	@Bean   
	public AspectJConfig aspectJConfig() {  //定义切面Bean
		return new AspectJConfig();
	}
	
	
	@Bean("farmer")
	public Farmer  farmer() {
		return new Farmer("陈永贵", "山西");
	}
	
}
