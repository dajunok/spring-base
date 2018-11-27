package liu.wiring.autowiring.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/autowiring/Autowired/spring-autowiringAutowired.xml");
		EmpService empService=(EmpService)context.getBean("empService");
		empService.play();
	}

}
