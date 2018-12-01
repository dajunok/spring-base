package liu.wiring.propertySource;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 案例调试类
 * @author dajun
 *
 */
public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx=new AnnotationConfigApplicationContext(PropertySourceConfig.class);
		Book bk=(Book)ctx.getBean("otherBook");
		System.out.println(bk.getBookName()+"\n"+bk.getAuthor()+"\n"+bk.getCopyright()+"\n"+bk.getPage()+"页");
	}
}
