package liu.aop.Designator;

/**
 * 父亲
 * @author LIU
 * Person：人类
 */
public class Father {
	private String name; //姓名
	private Integer age;  //年龄
	
	

	public Father(String name,Integer age) {
		super();
		this.name = name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}

	

}
