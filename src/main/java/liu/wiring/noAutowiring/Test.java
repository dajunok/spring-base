package liu.wiring.noAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/noAutowiring/spring-orderForm.xml");
		OrderForm order=(OrderForm)context.getBean("order0001");

		for(Goods g:order.goodslist) {
			System.out.println(g.getName());
		}
	
	}

}
