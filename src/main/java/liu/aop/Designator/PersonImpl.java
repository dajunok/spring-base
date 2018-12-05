package liu.aop.Designator;
/**
 * 人类接口实现类
 * @author dajun
 * earnMoney:挣钱
 * consume：消费
 * learn：学习
 */
public class PersonImpl implements Person{
	@Override
	public void earnMoney() {
		System.out.println("作为人类，为人要辛苦打拼挣钱......");
		
	}

	@Override
	public void consume() {
		System.out.println("作为人类，要消费各种东西......");
		
	}

	@Override
	public void learn() {
		System.out.println("作为人类，要活到老学到老......");
		
	}

}
