package liu.aop.GetCurrentMethod;

import java.lang.reflect.Modifier;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;

/**
 * 切面定义类
 * @author LIU
 *
 */
@Aspect
public class AspectJconfig { //throws AccountException
	@Pointcut(value="execution(public * liu.aop.GetCurrentMethod.Company.payment(..) throws AccountException) && args(account,money)",
			  argNames="account,money")
	public void   doPointcutt(Object account,Object money) {}
	
	@Around(value="doPointcutt(account,money)",argNames="point,account,money")
	public Object doAround(ProceedingJoinPoint point,Object account,Object money) throws Throwable {
		Object result=null;
		System.out.println("环绕通知，目标方法调用前......");	
//start------------------------------获取目标方法信息
		result=point.proceed(); //调用目标方法
		
		//execution(Company.payment(..))
		System.out.println(point.toShortString());	//返回切点表达式简短形式

		//execution(double liu.aop.GetCurrentMethod.Company.payment(Account,double))
		System.out.println(point.toString());	//返回切点表达式正常形式
		
		//execution(public double liu.aop.GetCurrentMethod.Company.payment(liu.aop.GetCurrentMethod.Account,double))
		System.out.println(point.toLongString());	//返回切点表达式完整形式
		
		//liu.aop.GetCurrentMethod.Company@22fcf7ab
		System.out.println(point.getThis().toString());	//返回当前正在执行的对象
		
		//liu.aop.GetCurrentMethod.Company@22fcf7ab
		System.out.println(point.getTarget().toString());	//返回目标对象
		
		//获取目标方法实参对象
		Object[] args=point.getArgs();
		for(Object o:args) {
			System.out.println(o.toString());	//打印连接点实参列表（目标方法实参）
			
		}
		
		//返回对应于连接点（目标方法）的源代码位置。
		SourceLocation sourceLocation=point.getSourceLocation();
		//class liu.aop.GetCurrentMethod.Company
		System.out.println("sourceLocation："+sourceLocation.getWithinType());
		
	//start------------------------------------【获取方法签名相关信息】
		Signature signature=point.getSignature();  //获取方法签名
		
		//payment
		System.out.println("【signature.getName()】："+signature.getName());  
		
		//Company.payment(..)
		System.out.println(signature.toShortString());//获取方法正常签名名称（返回值 包名+类名+方法名+参数）
		
		//double liu.aop.GetCurrentMethod.Company.payment(Account,double)
		System.out.println(signature.toString());//获取方法正常签名名称（返回值 包名+类名+方法名+参数）
		
		//public double liu.aop.GetCurrentMethod.Company.payment(liu.aop.GetCurrentMethod.Account,double)
		System.out.println(signature.toLongString());//获取方法正常签名名称（返回值 包名+类名+方法名+参数）
		
		//liu.aop.GetCurrentMethod.Company
		System.out.println(signature.getDeclaringTypeName());  //获取签名的声明类型名称
		
		//public
		System.out.println(Modifier.toString(signature.getModifiers()));  //返回方法前面的修饰符
	//end---------------------------------------【获取方法签名相关信息】
		
		
//end---------------------------------获取目标方法信息
		System.out.println("环绕通知，目标方法调用后......");	
		return result;
	}

}
