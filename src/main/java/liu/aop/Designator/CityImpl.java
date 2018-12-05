package liu.aop.Designator;
/**
 * 城市接口实现类
 * @author dajun
 *  City：城市
 *	duty：上班
 *	steelMaking：炼钢
 */
public class CityImpl implements City {

	@Override
	public void duty() {
		System.out.println("作为工人，在城市要踏踏实实去上班......");
		
	}

	@Override
	public void steelMaking() {
		System.out.println("作为工人，要给国家大炼钢铁让国家早日实现工业大国梦想.........");
	}

}
