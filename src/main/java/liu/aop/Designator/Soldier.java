package liu.aop.Designator;
/**
 * 军人
 * @author LIU
 * Soldier：战士
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





	
}
