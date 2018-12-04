package liu.aop.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws BlacklistException  {
		ApplicationContext context=new AnnotationConfigApplicationContext(AspectJConfig.class);
		SharedBicycle bicycle=context.getBean("shared001",SharedBicycle.class);
		
		bicycle.qrCodeScan("mobike", "喜得盛自行车有限公司");  //mobike Hello单车
	}

}
