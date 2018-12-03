package liu.aop.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 订单切面：定义切面类与通知（Advice）方法
 * @author LIU
 *
 */
public class AspectJ {
	//前置通知对应方法
	public void oderBefore(Object customer,Object address) //传入目标方法参数
	{ 
		System.out.println("调用代理类方法：oderBefore()"+"  "+"\n传入目标方法参数（顾客姓名）："+customer+"     "+"顾客地址："+address);
		System.out.println("订单准备中...........");
	}
	
	//环绕通知对应方法
	public void orderAround(ProceedingJoinPoint pjp)   {
		System.out.println("调用代理类方法：orderAround() 目标bean方法前");
		try {
			pjp.proceed();  //调用目标bean方法
		}catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("调用代理类方法：orderAround() 目标bean方法后");
	}
	
	//后置通知对应方法
	public void oderAfter(Object customer,Object address) //传入目标方法参数
	{
		System.out.println("调用代理类方法：oderAfter()");
		System.out.println("订单完成....."+"  "+"传入目标方法参数（顾客姓名）："+customer+"     "+"顾客地址："+address);
	}
	
	//返回通知对应方法,【注意！对应arg-names属性参数是3个，其中customer和age对应目标方法参数，returnValue是目标方法返回值】
	public void oderAfterReturn(Object customer,Object address,Object returnValue) 
	{
		System.out.println("调用代理类方法：OderAfterReturn()");
		System.out.println("订单完成并且已返回状态！！\n"+"订单状态： "+returnValue+"  "+"\n传入目标方法参数（顾客姓名）："+customer+"     "+"顾客地址："+address);	
	}
	
	//异常通知对应方法
	public void oderAfterThrowing(Object customer,Object age,Object exception) {
		System.out.println("调用代理类方法：oderAfterThrowing()");
		System.out.println("订单出错！！");
	}

}
