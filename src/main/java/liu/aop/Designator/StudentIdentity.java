package liu.aop.Designator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解：学生身份
 * @author LIU
 *
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentIdentity {
	String value() default ""; 
	String stage() default ""; //阶段，如：小学、中学、大学

}
