package liu.aop.Designator;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 切面定义类
 * @author LIU
 *
 */
@Aspect
public class AspectJConfig {
	//测试execution()指示器（表达式函数）
	@Pointcut(value="execution(public * liu.aop.Designator.Farmer.getName(..))")
	public void execution_p() {}	
	@Before(value="execution_p()")
	public void doExecution() {
		System.out.println("测试指示器execution()......");
	}
	
	//测试args()指示器（表达式函数）
	@Pointcut(value="execution(public * liu.aop.Designator.Farmer.setName(..)) && args(name)",argNames="name")
	public void args_p(Object name) {}
	
	//测试@args()指示器
	@Pointcut(value="@args(liu.aop.Designator.FarmerIdentity)")
	public void args_a() {}
	
	
	@Before(value="args_a()")
	public void doBefore() {
		System.out.println("前置通知方法doBefore");
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

















