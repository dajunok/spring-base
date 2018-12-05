package liu.aop.Advice;

import org.springframework.stereotype.Component;

/**
 * 目标Bean：通知管理器
 * @author LIU
 *
 */
@Component
public class AdviceManager {
	public void beforAddvice() {
		
		//这个方法将被BeforeAdviceTest类的permissionCheck匹配到
		System.out.println("目标方法：beforAddvice ");
	}

}
