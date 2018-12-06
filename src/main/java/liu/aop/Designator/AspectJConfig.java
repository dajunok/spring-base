package liu.aop.Designator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

/**
 * 切面定义类
 * @author LIU
 *
 */
@Aspect
public class AspectJConfig {
	//*****************************独立切点表达
	//测试execution()指示器（表达式函数）
	@Pointcut(value="execution(public * liu.aop.Designator.Farmer.cultivate(..)throws DesignatorException )")  //throws DesignatorException
	public void execution_p() {}	
	@Around(value="execution_p()")
	public Object  byExecution(ProceedingJoinPoint point) throws Throwable {
		Object result;
		String str=point.toString();
		System.out.println("环绕通知Around：\n"+"      执行目标对象之前打印：【"+str+"】"+"liulijun");
		result=point.proceed();
		System.out.println("      执行目标对象之后打印：【"+str+"】"+"liulijun\n");
		return result;
	}
	
	//测试args()指示器（表达式函数）	
	@Around(value="execution(public * liu.aop.Designator.Worker.duty(..)) && args(city,count)",argNames="point,city,count") 
	public Object byArgs(ProceedingJoinPoint point,Object city,Object count) throws Throwable {
		Object result;
		String str=point.toString();
		System.out.println("环绕通知Around：\n"+"      执行目标对象之前打印：【"+str+"】"+"zhangsan");
		result=point.proceed();
		System.out.println("      执行目标对象之后打印：【"+str+"】"+"zhangsan\n");
		return result;
	}
	
	//测试@args()指示器（表达式函数）
	@Around(value="execution(public * liu.aop.Designator.Soldier.*(..)) && @args(liu.aop.Designator.Identity)")
	public Object byaArgs(ProceedingJoinPoint point) throws Throwable {
		Object result;
		String str=point.toString();
		System.out.println("环绕通知Around：\n"+"      执行目标对象之前打印：【"+str+"】");
		result=point.proceed();
		System.out.println("      执行目标对象之后打印：【"+str+"】\n");
		return result;
	}
	
/*	//测试target()指示器（表达式函数）
		@Around(value="execution(public * liu.aop.Designator.Student.*(..)) && target(liu.aop.Designator.Consumer)")
		public Object byTarget(ProceedingJoinPoint point) throws Throwable {
			Object result;
			String str=point.toString();
			System.out.println("环绕通知Around：\n"+"      执行目标对象之前打印：【"+str+"】");
			result=point.proceed();
			System.out.println("      执行目标对象之后打印：【"+str+"】\n");
			return result;
		}*/
	
	//测试@target()指示器（表达式函数）
		@Around(value="execution(public * liu.aop.Designator.Student.getName(..)) && @target(liu.aop.Designator.Identity)")
		public Object byaTarget(ProceedingJoinPoint point) throws Throwable {
			Object result;
			String str=point.toString();
			System.out.println("环绕通知Around：\n"+"      执行目标对象之前打印：【"+str+"】");
			result=point.proceed();
			System.out.println("      执行目标对象之后打印：【"+str+"】\n");
			return result;
		}
	
	
	//*********************AOP引用接口新方法**************************************
	@DeclareParents(value="liu.aop.Designator.Farmer+",defaultImpl=CountrysideImpl.class)
	public Countryside countryside;  //农民引用农村接口功能
	
	@DeclareParents(value="liu.aop.Designator.Worker+",defaultImpl=CityImpl.class)
	public City city;  //工人引用城市接口功能
	
	@DeclareParents(value="liu.aop.Designator.Soldier+",defaultImpl=TroopsImpl.class)
	public Troops troops;  //军人引用部队接口功能
	
	@DeclareParents(value="liu.aop.Designator.Student+",defaultImpl=Schoolimpl.class)
	public School school;  //学生引用学校接口功能
	
	@DeclareParents(value="liu.aop.Designator.Father+",defaultImpl=PersonImpl.class)
	public Person person;  //父亲引用人类接口功能
}

















