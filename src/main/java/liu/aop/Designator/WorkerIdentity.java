package liu.aop.Designator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解：工人身份
 * @author LIU
 *
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WorkerIdentity {
	String value() default ""; //通用参数
	String workyears() default "0";  //工龄
	
}
