package liu.aop.Designator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 自定义注解：军人身份
 * @author LIU
 *
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface SoldierIdentity {
	String value() default "";
	String Military_Region() default "";  //军区
	int   years() default 0;  //参军入伍年数

}
