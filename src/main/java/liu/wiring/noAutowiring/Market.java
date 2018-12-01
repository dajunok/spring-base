package liu.wiring.noAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 商城
 * @author LIU
 *
 */
public class Market {
	private static ApplicationContext context=new AnnotationConfigApplicationContext(CustomerConfig.class);
	private static Customer customer=(Customer)context.getBean("c-wangWu");
	
	public static Customer getCustomer() {
		return customer;
	}
	
	

}
