package liu.wiring.autowiring.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:/liu/wiring/autowiring/byType/spring-autowiringbyType.xml");
		CDiscPlayer cdplayer=(CDiscPlayer) ac.getBean("cdiscPlayer");	
		
		cdplayer.play();

	}

}
