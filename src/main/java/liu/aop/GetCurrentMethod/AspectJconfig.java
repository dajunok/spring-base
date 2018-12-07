package liu.aop.GetCurrentMethod;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Bean;

/**
 * 切面定义类
 * @author LIU
 *
 */
@Aspect
public class AspectJconfig { //throws AccountException
	//@Around(value="execution(public * liu.aop.Designator.Worker.duty(..)) && args(city,count)",argNames="point,city,count")
	@Pointcut(value="execution(public * liu.aop.GetCurrentMethod.Company.payment(..)throws AccountException) && args(money)",
			  argNames="money")
	public void dopointcutt(Object money) {}
	
	@Around(value="value=\"execution(public * liu.aop.GetCurrentMethod.Company.payment(..)throws AccountException) && args(money)",
			argNames="point,money")
	public Object byProceedingJ(ProceedingJoinPoint point,Object money) throws Throwable {
		Object result=null;
		System.out.println("目标方法调用前......");				
		result=point.proceed(); //调用目标方法
		System.out.println("目标方法调用后......");	
		return result;
	}
	
	@Before(value="execution(public * liu.aop.GetCurrentMethod.Company.payment(..))")
	public void doBefore() {
		System.out.println("目标方法调用之前......");	
	}

}
