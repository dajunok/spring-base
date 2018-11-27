package liu.wiring.noJavaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:/liu/wiring/noJavaConfig/spring-nojavaconfig.xml");
		EmpService es=(EmpService)ac.getBean("empService");
		es.play();

	}

}
