package liu.wiring.Importing;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={OfficeBuilding.class})
public class Test {
	@Autowired
	@Qualifier("generalManager")
	private Post post;
	
	@Autowired
	@Qualifier("generalManagerLevel")
	private Grade grade;
	
	@Autowired
	@Qualifier("jieZhong")
	private Employee employee;
	
	@org.junit.Test
	public void  printPost() {
		System.out.println("员工姓名："+employee.getName());
		System.out.println("职务是："+post.getName());
		System.out.println("工资级别是："+grade.getName());
	}

}
