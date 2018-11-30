package liu.wiring.noAutowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 顾客配置类：用于创建与顾客相关的bean
 * @author LIU
 *
 */
@Configuration
public class CustomerConfig {
	@Bean("c-wangWu")
	public Customer cusWangwu() { return new Customer("001", "王五", "18866661111");}
	
	@Bean("c-zhaoLiu")
	public Customer cusZhaoliu() { return new Customer("002", "赵六", "18866662222");}
	
	@Bean("c-chenqi")
	public Customer cusChenqi() { return new Customer("002", "陈七", "18866663333");}
	
	@Bean("c-huba")
	public Customer cusHuba() { return new Customer("002", "胡八", "18866663333");}

}
