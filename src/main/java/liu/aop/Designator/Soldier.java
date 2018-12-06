package liu.aop.Designator;
/**
 * 军人
 * @author LIU
 * Soldier：战士
 * Fight：打仗
 * shoot：射击
 */
public class Soldier {
	private String name;          //姓名
	private String militaryRank;  //军衔
	
	public Soldier(String name, String militaryRank) {
		super();
		this.name = name;
		this.militaryRank = militaryRank;
	}
	
	public String getName() {
		return name;
	}

	public String getMilitaryRank() {
		return militaryRank;
	}

	public Integer fight(Troops troops,Integer count) {
		troops.Fight();
		return count;  //受伤人数
	}
	
	public Integer shoot(Troops troops,Integer count) {
		troops.shoot();
		return count;  //打靶环数
	}
	
	public void  shoot(Troops troops) {
		troops.shoot();
	}



	
}
