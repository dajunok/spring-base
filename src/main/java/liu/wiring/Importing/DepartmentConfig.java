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
	@Bean("financeDepartment")
	public Department depFinance() {return new Department("financeDepartment");}
	
	@Bean("etmDepartment")
	public Department depEtm() {return new Department("etmDepartment");}
	
	@Bean("technologyDepartment")
	public Department depTechnology() {return new Department("technologyDepartment");}
}
