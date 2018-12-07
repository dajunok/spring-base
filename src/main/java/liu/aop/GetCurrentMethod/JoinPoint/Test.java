package liu.aop.GetCurrentMethod.JoinPoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aop/GetCurrentMethod/JoinPoint/spring-aopjoinpoint.xml");
		Hello hello=(Hello)context.getBean("hello");
		hello.addUser("zhangSan", "pass");
		
	}

}
