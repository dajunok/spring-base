package liu.wiring.noAutowiring;

import java.util.Map;

/**
 * 人员（全体员工）
 * @author LIU
 *
 */
public class Personnel {
	private String name; //姓名
	private String post; //岗位
	private String Status;  //状态：在职或离职
	private Map<String, Integer> score;  //综合考核积分情况，总计100分
	
	public Personnel(String name, String post, String status,Map<String, Integer> score) {
		super();
		this.name = name;
		this.post = post;
		this.Status = status;
		this.score=score;
	}

	public String getName() {
		return this.name;
	}

	public String getPost() {
		return this.post;
	}

	public String getStatus() {
		return this.Status;
	}
	
	public Map<String, Integer> getScore() {
		return score;
	}
	

}
