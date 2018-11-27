package liu.wiring.autowiring.constructor;

public class EmpService {
	private Emp	emp;
	//settor器注入
	public void setEmp(Emp emp) {
		System.out.println("执行...");
	 	this.emp = emp;
	}
	
	//构造器注入
	public EmpService(Emp emp) {
		System.out.println("这是构造参数...");
	 	this.emp = emp;
	}
}
