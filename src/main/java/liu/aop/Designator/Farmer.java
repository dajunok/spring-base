package liu.aop.Designator;


/**
 * 农民：
 * @author LIU
 * 
 * Farmer：农民
 * Countryside：农村
 * cultivate：种地
 */
public class Farmer {
	private String name;  //姓名
	private String nativePlace;  //籍贯
	
	public Farmer(String name, String nativePlace) {
		super();
		this.name = name;
		this.nativePlace = nativePlace;
	}

	public String getName() {
		return name;
	}

	public String getNativePlace() {
		return nativePlace;
	}
	
	@Identity("姓名")
	public void setName(String name) {
		this.name = name;
		System.out.println("    姓名："+name);
	}

	@Identity(value="山西")
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
		System.out.println("    籍贯："+nativePlace);
	}

	public double  cultivate(Countryside countryside,Integer count) throws DesignatorException {
		if(count>10) {
			throw new DesignatorException("      指示器异常，该农民种植面积太大，不易管理！！");
		}
		countryside.cultivate();
		return count; //种植数量
	}
	
	
}
