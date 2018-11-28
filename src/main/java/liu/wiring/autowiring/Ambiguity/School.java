package liu.wiring.autowiring.Ambiguity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

/**学校
 * 
 * @author LIU
 *
 */
@Component("school")
@Configuration
@ComponentScan(basePackages="liu.wiring.autowiring.Ambiguity")
@ImportResource(locations="classpath:/liu/wiring/autowiring/Ambiguity/spring-autowiringAmbiguity.xml")
public class School {
	@Autowired	
	@Qualifier("physicsClass")
	private Course course;  //自动注入课程
	
	//学校上课
	public void attendClass(){
		System.out.println(course);
	}
	
}
