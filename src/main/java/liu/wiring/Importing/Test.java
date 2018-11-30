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
	@Qualifier("liZhiFen")   //yuMan jieZhong  zhengHu  yuanYuMing liZhiFen
	private Employee employee;
	
	@org.junit.Test
	public void  printEmployee() {
		System.out.println("员工姓名    ："+employee.getName());
		System.out.println("职务是        ："+employee.getPost());
		System.out.println("工资级别是："+employee.getGrade());
		System.out.println("部门是        ："+employee.getDepartment());
		System.out.println("办公室是    ："+employee.getOffice());
	}

}
