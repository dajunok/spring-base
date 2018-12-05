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
		return name;
	}

	public String getWorkKind() {
		return workKind;
	}

	public Integer getAge() {
		return age;
	}




	
}
