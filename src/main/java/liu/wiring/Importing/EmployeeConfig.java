package liu.wiring.Importing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 职员配置类
 * 	1、用于创建与职员相关的bean，同时织入其他依赖Bean
 * @author dajun
 *
 */
@Configuration
public class EmployeeConfig {
	//*********************职务**************************
	@Autowired
	@Qualifier("clerksgeneral")  
	private Post clerksgeneralPost;  //职务：普通职员	
	@Autowired
	@Qualifier("director")      
	private Post directorPost;   //职务：主管	
	@Autowired
	@Qualifier("manager")
	private Post managerPost;    //职务：经理	
	@Autowired
	@Qualifier("generalManager")  
	private Post generalManagerPost;  //职务：总经理	
	
	
	//*********************工资级别**************************
	@Autowired
	@Qualifier("generalLevel")
	private Grade generalGrade;  //工资级别：普通级别	
	@Autowired
	@Qualifier("supervisorLevel")
	private Grade supervisorGrade;  //工资级别：主管级别
	@Autowired
	@Qualifier("managerLevel")
	private Grade managerGrade;  //工资级别：经理级别
	@Autowired
	@Qualifier("generalManagerLevel")
	private Grade generalManagerGrade;  //工资级别：总经理级	
	
	//*********************部门**************************
	@Autowired
	@Qualifier("financeDepartment")
	private Department financeDepartment;  //财务部	
	@Autowired
	@Qualifier("etmDepartment")
	private Department etmDepartment;  //ETM部	
	@Autowired
	@Qualifier("technologyDepartment")
	private Department technologyDepartment;  //技术部
	
	//*********************办公室**************************
	@Autowired
	@Qualifier("financeOffice")
	private Office financeOffice;  //财务办公室
	@Autowired
	@Qualifier("etmOffice")
	private Office etmOffice;  //ETM办公室
	@Autowired
	@Qualifier("technologyOffice")
	private Office technologyOffice;  //技术部办公室
	
	
	
	@Bean("zhengHu")
	public Employee empZhengHu() {return new Employee("郑虎",managerPost,managerGrade,technologyDepartment,technologyOffice);}
	
	@Bean("yuMan")
	public Employee empYuMan() {return new Employee("余漫",directorPost,supervisorGrade,technologyDepartment,technologyOffice);}
	
	@Bean("jieZhong")
	public Employee empJieZhong() {return new Employee("莫结终",generalManagerPost,generalManagerGrade,technologyDepartment,technologyOffice);}
	
	@Bean("yuanYuMing")
	public Employee etmyuanYuMing() {return new Employee("袁裕明",generalManagerPost,generalManagerGrade,etmDepartment,etmOffice);}
	
	@Bean("liZhiFen")
	public Employee financeLiZhiFeng() {return new Employee("李志芬",clerksgeneralPost,generalGrade,financeDepartment,financeOffice);}

}

















