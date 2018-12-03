package liu.aop.xml;

/**
 * 订单增强类（也叫引用【Introduction】）：通过AOP给Order类增加检查功能。
 * @author LIU
 *
 */
public class CheckOrderImp implements CheckOrder{

	@Override
	public void check() {
		System.out.println("检查订单！");
				
	}

}
