package liu.aop.Designator;
/**
 * 工人
 * @author LIU
 * 	Worker：工人
 *  City：城市
 *	duty：上班
 *	steelMaking：炼钢
 */
public class Worker implements City{

	@Override
	public void duty() {
		System.out.println("作为工人，在城市要踏踏实实去上班......");
		
	}

	@Override
	public void steelMaking() {
		System.out.println("作为工人，要给国家大炼钢铁让国家早日实现工业大国梦想.........");
	}
	
}
