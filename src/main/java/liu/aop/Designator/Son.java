package liu.aop.Designator;


/**
 * 儿子
 * @author LIU
 *
 */
public class Son extends Father{
	private String name;  //姓名
	private Integer age;  //年龄
	
	
	
	public Son(String name, Integer age, String name2, Integer age2) {
		super(name, age);
		name = name2;
		age = age2;
	}

	

	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}

}
