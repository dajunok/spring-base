package liu.wiring.Importing;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 部门配置类
 * 	1、用于创建与部门有关的bean
 * @author LIU
 *
 */
@Configuration
@Import({EmployeeConfig.class})
public class DepartmentConfig {
	@Bean("financeDepartment")   //财务部
	public Department depFinance() {return new Department("财务部");}
	
	@Bean("etmDepartment")  //ETM部
	public Department depEtm() {return new Department("ETM部");}
	
	@Bean("technologyDepartment")  //技术部
	public Department depTechnology() {return new Department("技术部");}
}
