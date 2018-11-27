package liu.wiring.componentScan;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=JavaConfig.class)
public class Test {
	@Autowired
	private HelloWorld h;
	
	@org.junit.Test
	public void say() {
		h.sayHello();
	}
	

}
