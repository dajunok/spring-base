package liu.aop.Designator;

/**
 * 父亲
 * @author LIU
 * Person：人类
 * earnMoney:挣钱
 * consume：消费
 * learn：学习
 */
public class Father implements Person{

	@Override
	public void earnMoney() {
		System.out.println("作为父亲，为人要辛苦打拼挣钱......");
		
	}

	@Override
	public void consume() {
		System.out.println("父亲也是消费者，要消费各种东西......");
		
	}

	@Override
	public void learn() {
		System.out.println("作为父亲要活到老学到老......");
		
	}

}
