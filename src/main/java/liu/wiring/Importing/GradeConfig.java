package liu.wiring.Importing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 工资级别配置类
 * @author LIU
 *
 */
@Configuration
public class GradeConfig {
	@Value("普通级别")
	private String generalLevel; //普通级别
	
	@Value("主管级")
	private String supervisorLevel;  //主管级
	
	@Value("经理级")
	private String managerLevel;  //经理级
	
	@Value("总经理级")
	private String generalManagerLevel;  //总经理级
	
	@Bean("generalLevel")
	public Grade createGeneralGrade() { return new Grade(generalLevel);}
	
	@Bean("supervisorLevel")
	public Grade createSupervisorGrade() { return new Grade(supervisorLevel);}
	
	@Bean("managerLevel")
	public Grade createManagerGrade() { return new Grade(managerLevel);}
	
	@Bean("generalManagerLevel")
	public Grade createGeneralManagerGrade() { return new Grade(generalManagerLevel);}
	
	
	

}
