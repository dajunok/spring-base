package liu.aop.Annotation;

/**
 * 共享单车充值实现类
 * @author LIU
 *
 */
public class RechargeImpl implements Recharge {
	private BicycleAccount account;  //共享单车账户

	public RechargeImpl(BicycleAccount account) {
		super();
		this.account = account;
	}

	@Override
	public float pay(float money) {     //给共享单车账户充值
		this.account.setAmount(money);
		return money;
	}

	@Override
	public void checkBalance() throws AccountException {  //检查共享单车账户余额是否充足
		if(account.getAmount()<100) {
			throw new AccountException("账户余额不足，请及时充值！");  //抛出账户异常
		}
		System.out.println("账户余额："+account.getAmount());
	}

}
