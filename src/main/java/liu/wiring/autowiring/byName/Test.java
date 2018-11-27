package liu.wiring.autowiring.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:/liu/wiring/autowiring/byName/spring-autowiringByname.xml");
		CDiscPlayer cdplayer=(CDiscPlayer) ac.getBean("cdiscPlayer");	
		
		cdplayer.play();

	}

}
