package liu.wiring.autowiring.beanScope;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="liu.wiring.autowiring.beanScope")
@ImportResource(locations= {"classpath:/liu/wiring/autowiring/beanScope/spring-autowiringScope.xml"})
public class BenConfig {

}
