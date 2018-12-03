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
		
		//通过AOP引用功能把CheckOrderImp类定义为目标类的父类，使用时将目标bean转换为CheckOrder接口类型，然后调用CheckOrder接口实现类CheckOrderImp的check()方法。
		System.out.println("\n//AOP引用功能测试----------------------------------");
		CheckOrder checkOrder=(CheckOrder)order;
		checkOrder.check();
		
		System.out.println("\n//AspectJ异常通知测试----------------------------------");
		order.pay("张三",46); //调用目标bean方法（其实真正调用的是代理bean方法）
		
		
		
		
	}

}
