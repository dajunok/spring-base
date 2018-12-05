package liu.aop.Designator;
/**
 * 学校接口实现类
 * @author dajun
 *	attendClass：上课
 */
public class Schoolimpl implements School{
	@Override
	public void attendClass() {
		System.out.println("作为学生,在学校要认认真真上课，不能开小差......");		
	}

}
