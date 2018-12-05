package liu.aop.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import liu.aop.xml.OrderException;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws BlacklistException, OrderException, AccountException  {
		ApplicationContext context=new AnnotationConfigApplicationContext(AspectJConfig.class);
		
		//获取目标bean
		SharedBicycle bicycle=context.getBean("shared001",SharedBicycle.class); 
		//获取共享单车账户bean
		BicycleAccount account=context.getBean("bicycleAccount",BicycleAccount.class);
		
		bicycle.qrCodeScan("Hello", "喜得盛自行车有限公司");  //mobike Hello 青桔单车
		
		Recharge recharge=(Recharge)bicycle;  //通过AOP配置类中@DeclareParents注解功能，将目标bean转换成Recharge（充值类）类型。
				
		//recharge.pay(account, 150); //给共享单车账户充值
		recharge.checkBalance(account);  //检查共享单车账户余额
		
		
	}

}
