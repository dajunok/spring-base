package liu.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws OrderException {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aop/xml/spring-AspectJConfig.xml");		
		
		Order order=context.getBean("oder001",Order.class); //获取目标bean
		System.out.println("\n//无参数调用----------------------------------");
		order.pay();
		
		System.out.println("\n//带参数调用----------------------------------");
		order.pay("张三","发达路百强村富豪别墅18栋1806室"); //调用目标bean方法（其实真正调用的是代理bean方法）
		
		System.out.println("\n//AspectJ异常通知测试----------------------------------");
		order.pay("张三",46); //调用目标bean方法（其实真正调用的是代理bean方法）
		
		
		
	}

}
