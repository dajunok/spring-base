package liu.wiring.autowiring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/autowiring/constructor/spring-autowiringConstructor.xml");
		EmpService empService=(EmpService)context.getBean("empService");
	}

}
