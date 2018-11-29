package liu.wiring.Importing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * 职员配置类
 * 	1、用于创建与职员相关的bean 
 * @author dajun
 *
 */
@Configuration
public class EmployeeConfig {
	@Bean("zhengHu")
	public Employee empZhengHu() {return new Employee("郑虎");}
	
	@Bean("yuMan")
	public Employee empYuMan() {return new Employee("余漫");}
	
	@Bean("jieZhong")
	public Employee empJieZhong() {return new Employee("莫结终");}
	

}
