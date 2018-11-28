package liu.wiring.autowiring.Ambiguity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 学校厨师
 * @author LIU
 *
 */
@Component
@Qualifier("schoolCook")
@cook      //自创建的限定符（通过自定义注解实现）
public class SchoolCook {
	
	public SchoolCook() {
		System.out.println("我是校厨......");
	}
}
