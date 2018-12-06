package liu.aop.Designator;
/**
 * 学生
 * @author LIU
 * attendClass：上课
 */
@Identity(value="学生",Certificates="学生证")
public class Student extends Consumer{
	private String name;  //姓名
	private String classes; //班级
	private Integer totalScore;  //总成绩
	
	public Student(String name, String classes,Integer totalScore) {
		super();
		this.name = name;
		this.classes = classes;
		this.totalScore=totalScore;
	}

	public String getName() {
		System.out.println("     学生姓名："+name);
		return name;
	}
	public Integer getTotalScores() {
		return totalScore;
	}
	
	public String getClasses() {
		return classes;
	}

	public Integer attendClass(School school,Integer count) {
		school.attendClass();
		return count;  //上课人数
	}


}
