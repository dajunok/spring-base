package liu.aop.Designator;
/**
 * 学生
 * @author LIU
 *
 */
public class Student implements School{

	@Override
	public void attendClass() {
		System.out.println("作为学生,在学校要认认真真上课，不能开小差......");		
	}

}
