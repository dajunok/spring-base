package liu.aop.Advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Aop切面配置类：主要用于配置切点Pointcut表达式、通知Advice。
 * @author LIU
 *
 */
@Aspect
public class AspectConfig {
	//匹配com.abc.service下的类中以before前缀开头的方法
	@Before("execution(* liu.aop.Advice.*.befor*(..))")
	public void permissionCheck() {
		System.out.println("模拟权限检查！");
	}

}
