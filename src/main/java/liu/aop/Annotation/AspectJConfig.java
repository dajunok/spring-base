package liu.aop.Annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.Ordered;

import liu.aop.xml.OrderException;

@Configuration
@EnableAspectJAutoProxy
@Aspect
public class AspectJConfig implements Ordered{
	//创建目标bean：共享单车
	@Bean("shared001")  
	public SharedBicycle shared001(@Value("#{'0001'}") String bicycleID,
			                       @Value("#{0}") Integer lockStatus) {
		return new SharedBicycle(bicycleID, lockStatus);
	}
	
	//
	@Bean("bicycleAccount")
	public BicycleAccount bicycleAccount(@Value("#{'ac001'}") String id,
			@Value("#{3000.00}") float amount)
	{
		return new BicycleAccount(id, amount);
	}
	
	//单独定义切点表达式(注意！args(bran,manufactor)与argNames="bran,manufactor"参数名称必须一致)
	@Pointcut(value="execution(public * liu.aop.Annotation.SharedBicycle.qrCodeScan(..)) && args(bran,manufactor)",argNames="bran,manufactor")
	public void  bicyclePointcut(Object bran,Object manufactor) {};  //切点签名函数，对应目标方法参数bran和manufactor
	
	//定义前置通知(注意！bicyclePointcut(brann,manufactorr)与argNames="brann,manufactorr"参数名称必须一致)
	@Before(value="bicyclePointcut(brann,manufactorr)",argNames="brann,manufactorr")
	public void bicycleBefore(Object bran,Object manufactor) {
		System.out.println("调用代理类方法：bicycleBefore()"+"  "+"\n传入目标方法参数（共享单车品牌：）："+bran+"     "+"共享单车生产厂家： "+manufactor);
		System.out.println("正在扫码...........");
	}
	
	/*定义环绕通知
	* 环绕通知需要携带ProceedingJoinPoint类型的参数
	* 环绕通知类似于动态代理的全过程：ProceedingJoinPoint类型的参数可以决定是否执行目标方法。
	* 而且环绕通知必须有返回值，返回值即为目标方法的返回值*/
	
	@Around(value="execution(public * liu.aop.Annotation.SharedBicycle.qrCodeScan(..))")
	public Object  bicycleAround(ProceedingJoinPoint pjp) throws Throwable   {
		Object result=null;
		System.out.println("调用代理类方法：bicycleAround() 目标bean方法前");
		
		result=pjp.proceed();  //调用目标bean方法
		
		System.out.println("调用代理类方法：bicycleAround() 目标bean方法后");
		return result;
	}
	
	//定义后置通知
	@After(value="execution(public * liu.aop.Annotation.SharedBicycle.qrCodeScan(..)) && args(bran,manufactor)",argNames="bran,manufactor")
	public void bicycleAfter(Object bran,Object manufactor) //传入目标方法参数
	{
		System.out.println("调用代理类方法：bicycleAfter()");
		System.out.println("开锁成功，自由骑行！....."+"  "+"传入目标方法参数（共享单车品牌：）："+bran+"     "+"共享单车生产厂家："+manufactor);
	}
	
	//定义返回通知
	@AfterReturning(pointcut="execution(public * liu.aop.Annotation.SharedBicycle.qrCodeScan(..)) && args(bran,manufactor)",
			returning="returnValue",argNames="bran,manufactor,returnValue")
	public void bicycleAfterReturn(Object bran,Object manufactor,Object returnValue) 
	{
		
		System.out.println("调用代理类方法：bicycleAfterReturn()");
		System.out.println("开始骑行并返回锁状态！！\n"+"锁状态： "+returnValue+"  "+"\n传入目标方法参数（共享单车品牌：）："+bran+"     "+"共享单车生产厂家："+manufactor);
	}
	
	//定义异常通知
	@AfterThrowing(pointcut="bicyclePointcut(bran,manufactor)",
			argNames="bran,manufactor,exception",
			throwing="exception")
	public void bicycleAfterThrowing(Object bran,Object manufactor,BlacklistException exception) {  
		System.out.println("\n调用代理类方法：bicycleAfterThrowing()  ");
		System.out.println(bran+"单车太重，不好骑！");
	}
	
	//配置AOP，通过注解@DeclareParents引入新的方法。（指定代理类接口、和具体实现类达到增强功能目的）
	@DeclareParents(value="liu.aop.Annotation.SharedBicycle+",defaultImpl=RechargeImpl.class)
	public Recharge recharge; //充值接口
	
	@Override
	public int getOrder() {
		return 1;
	}
	
}




















