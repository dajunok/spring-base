package liu.aop.Designator;


/**
 * 工人
 * @author LIU
 * 	Worker：工人
 *  City：城市
 *	duty：上班
 *	steelMaking：炼钢
 */
public class Worker {
	private String name; //姓名
	private String workKind; //工种
	private Integer age; //年龄
	
	public Worker(String name, String workKind, Integer age) {
		super();
		this.name = name;
		this.workKind = workKind;
		this.age = age;
	}
	
	public String getName() {
		System.out.println("    工人姓名："+name);
		return name;
	}

	public String getWorkKind() {
		System.out.println("    工种："+workKind);
		return workKind;
	}

	public Integer getAge() {
		System.out.println("    工人年龄："+age);
		return age;
	}

	public int steelMaking(City city,Integer count) {
		city.steelMaking();
		return count;   //炼钢吨数
	}
	
	public Integer duty(City city,int count) {
		city.duty();		
		return count;  //上班小时数
	}


	
}
