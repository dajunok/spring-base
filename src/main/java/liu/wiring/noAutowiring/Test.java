package liu.wiring.noAutowiring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/noAutowiring/spring-orderForm.xml");
		OrderForm order=(OrderForm)context.getBean("order0001");

		System.out.println("【水果清单】");
		for(Goods g:order.getGoodslist()) {
			System.out.println("    "+g.getName());		
		}
		
		context=new AnnotationConfigApplicationContext(ShoppingGartConfig.class);
		ShoppingCart cart=(ShoppingCart)context.getBean("shop-001");
		List<Goods> goodses=cart.getGoodsList();
		for(Goods g:goodses) {
			System.out.println(g.getName()+"   "+g.getPrice()+"/"+g.getUnit()+"   "+g.getKind());
		}
		
	}

}
