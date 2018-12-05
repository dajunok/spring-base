package liu.aop.Designator;
/**
 * 军人
 * @author LIU
 * Soldier：战士
 * Fight：打仗
 * shoot：射击
 */
public class Soldier implements Troops{

	@Override
	public void Fight() {
		System.out.println("军人打仗就有流血牺牲......");
		
	}

	@Override
	public void shoot() {
		System.out.println("是军人就要刻苦练习射击技术......");
		
	}
	
}
