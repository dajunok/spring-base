package liu.aop.GetCurrentMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws AccountException  {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/aop/GetCurrentMethod/spring-beanConfig.xml");
		Company company=context.getBean("company",Company.class);
		Account account=context.getBean("account",Account.class);
		
		company.payment(account,20000);
		
	}
	
	
	
}
