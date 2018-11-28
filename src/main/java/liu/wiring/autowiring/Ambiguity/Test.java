package liu.wiring.autowiring.Ambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
/*		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/autowiring/Ambiguity/spring-autowiringAmbiguity.xml");
		Course course=(Course)context.getBean("physicsClass");
		
		System.out.println(course.getClass().getName());
		System.out.println(course.toString());*/
		
		ApplicationContext cx=new AnnotationConfigApplicationContext(School.class);
		School school=(School)cx.getBean("school");
		school.attendClass();	
		
	}

}
