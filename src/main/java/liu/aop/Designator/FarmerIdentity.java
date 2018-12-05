package liu.aop.Designator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * 自定义注解：（农民身份）
 */
@Target({ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FarmerIdentity {
	String value() default"";
	String fullName() default"";  //姓名
	String region() default"";  //区域，如“北方”
}
