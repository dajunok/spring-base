package liu.aop.Annotation;
/**
 * 共享单车充值接口：给共享单车充值、检查余额。
 * @author LIU
 *
 */
public interface Recharge {
	float pay(BicycleAccount account,float money);  //给共享单车账户充值
	void checkBalance(BicycleAccount account) throws AccountException;  //检查余额
}
