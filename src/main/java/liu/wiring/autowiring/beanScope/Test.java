package liu.wiring.autowiring.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new AnnotationConfigApplicationContext(BenConfig.class);
		Cart cart=(Cart)context.getBean("cart");
		cart.addGoods();
		
		Product product=(Product)context.getBean("product");
		System.out.println("产品名称："+product);
	}
}
