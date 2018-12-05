package liu.aop.Designator;
/**
 * 学生
 * @author LIU
 *
 */
public class Student {
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
		return name;
	}
	public Integer getTotalScores() {
		return totalScore;
	}
	
	public String getClasses() {
		return classes;
	}

	

}
