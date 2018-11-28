package liu.wiring.autowiring.Ambiguity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=School.class)
public class TestQualifier {
	@Autowired
	@Qualifier("schoolCook")  //使用自定义限定符
	@cook                     //使用自创建的限定符
	private SchoolCook cook;
	
	@Test
	public void testqualifier() {
		System.out.println(cook.toString());
	}
	

}
