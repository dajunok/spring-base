package liu.aop.Annotation;

/**
 * 共享单车充值实现类
 * @author LIU
 *
 */
public class RechargeImpl implements Recharge {

	public float pay(BicycleAccount account,float money) {     //给共享单车账户充值
		account.setAmount(money);
		return money;
	}

	@Override
	public void checkBalance(BicycleAccount account) throws AccountException {  //检查共享单车账户余额是否充足
		if(account.getAmount()<100) {
			System.out.println("账户余额不足，请及时充值！");
			throw new AccountException("账户异常");  //抛出账户异常
		}
		System.out.println("账户余额："+account.getAmount()+"元");
	}

}
