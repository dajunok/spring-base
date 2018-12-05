package liu.aop.Designator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);

		Farmer farmer=context.getBean("farmer",Farmer.class);
		
		//测试@args()指示器
		CountrysideImpl countrysideImpl=new CountrysideImpl();
		farmer.setCountrysideImpl(countrysideImpl);
		
		farmer.getName();
		
		farmer.setName("张三");
		Countryside countryside=(Countryside)farmer;
		countryside.cultivate();

	}

}
