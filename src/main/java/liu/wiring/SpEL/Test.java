package liu.wiring.SpEL;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/SpEL/spring-Book.xml");
		Book book=(Book)context.getBean("book001");
		System.out.println(book.getBookName()+
							"\n"+book.getCopyright()+
							"\n"+book.getAuthor()+
							"\n"+book.getPage());
		context=new AnnotationConfigApplicationContext(JavaConfig.class);
		book=(Book)context.getBean("bookj002");
		System.out.println(book.getBookName()+
				"\n"+book.getCopyright()+
				"\n"+book.getAuthor()+
				"\n"+book.getPage()+"页");
		
		BasicData data=(BasicData)context.getBean("basicDataAu");
		System.out.println("\n---------basicData-------------------------------");
		System.out.println("str：  "+data.getStr());
		System.out.println("i：  "+data.getI());
		System.out.println("book：  "+data.getBook().getBookName());
		
		//SpEL运用-------------------------
		context=new ClassPathXmlApplicationContext("classpath:/liu/wiring/SpEL/spring-SpEL.xml");
		SpringExpressionLanguage spel=(SpringExpressionLanguage) context.getBean("spel002");
		System.out.println(spel.getName());
		
		List<Integer> list=spel.getIntList();
		for(int i:list) {
			System.out.println("List列表值： "+i);
		}		
		System.out.println("Time："+spel.getTime());		
		Map<String, String> map=spel.getStrMap();
		System.out.println("Map key(liSi)："+map.get("liSi"));
		
		System.out.println("\n---------SpringRef-------------------------------");
		SpringRef spRef=(SpringRef) context.getBean("srf");
		System.out.println("str：  "+spRef.getStr());
		System.out.println("i：  "+spRef.getI());
		System.out.println("book：  "+spRef.getBook());
		spRef=(SpringRef) context.getBean("srf01");
		System.out.println("str：  "+spRef.getStr());
		System.out.println("i：  "+spRef.getI());
		System.out.println("book：  "+spRef.getBook());
		
	}

}
