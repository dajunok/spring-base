package liu.wiring.propertyPlaceholder;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 案例调试类
 * @author dajun
 *
 */
public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlaceholderConfig.class);
        User user = (User) context.getBean("user");
        System.out.println(user.getUserName());
        System.out.println(user.getUserAge());
        System.out.println(user.getRole().getRoleName());
        System.out.println(user.getRole().getRoleCode());

        //ApplicationContext ac = new ClassPathXmlApplicationContext("/liu/PropertyPlaceholder/spring-properties.xml");
        DataSource dataSource = (DataSource)context.getBean("dataSource");
        System.out.println(dataSource);
	}

}
