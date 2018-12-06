package liu.aop.Designator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws DesignatorException {
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);

		//------------测试execution()指示器（切点表达式函数）
		Farmer farmer=context.getBean("farmer",Farmer.class);
		Countryside countryside=context.getBean("countryside",Countryside.class);
		//farmer.getName();
		farmer.cultivate(countryside, 10);
		
		//------------测试args()指示器（切点表达式函数）
		Worker worker=context.getBean("worker",Worker.class);
		City city=context.getBean("city",City.class);
		worker.duty(city, 8);
		
		//------------测试@args()指示器（切点表达式函数）
		Soldier soldier=context.getBean("soldier",Soldier.class);
		Troops troops=context.getBean("troops",Troops.class);
		soldier.shoot(troops);
		
		//------------测试target()指示器（切点表达式函数）
		Student student=context.getBean("student",Student.class);
		School school=context.getBean("school",School.class);
		student.attendClass(school, 46);
		
		//------------测试@target()指示器（切点表达式函数）
		student.getName();
		
		//------------测试within()指示器（切点表达式函数）		
		worker.getName();
		worker.getAge();
		worker.getWorkKind();
		
		//------------测试@annotation()指示器（切点表达式函数）
		farmer.setName("络铁干");
		farmer.setNativePlace("东莞");
	}

}
