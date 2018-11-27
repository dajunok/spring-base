package liu.wiring.autowiring.Autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class EmpService {
	private Emp emp;
	
	@Autowired
	public void setEmp(Emp emp) {
		System.out.println("执行...");
		this.emp = emp;
	}
	
	public void play(){
		emp.play();
	}
}
