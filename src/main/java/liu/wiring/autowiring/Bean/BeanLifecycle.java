package liu.wiring.autowiring.Bean;

public class BeanLifecycle {
	public void beanInit() {
		System .out.println("初始化Bean===>BeanLifecycle...");
		
	}
	
	public void beanDestroy() {
		System.out.println("销毁bean===>BeanLifecycle...");
	}

}
