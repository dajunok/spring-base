package liu.aop.Designator;
/**
 * 接口：部队
 * @author LIU
 *
 */
@Identity(value="军人",Certificates="军官证")
public interface Troops {
	public void Fight();  //打仗 make war
	public void shoot();  //射击
}
