package liu.wiring.autowiring.Bean;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class Test {
	
	@Autowired
	@Qualifier("gf")   //使用别名指定bean
	private Family family;
	
	@org.junit.Test
	public void print() {
		family.familyMember();
	}
}
