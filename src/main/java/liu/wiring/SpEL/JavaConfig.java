package liu.wiring.SpEL;
/**
 * 配置类：用于定义Bean
 * 	1、该配置类主要测试了Spring表达式SpEL的用法。
 * @author dajun
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations= {"classpath:/liu/wiring/SpEL/spring-SpEL.xml"})
public class JavaConfig {
	@Bean("bookj001")
	public Book bookj001() {
		return new Book("GitHub入门与实践", "中国工信出版集团", "刘斌", 286);
	}
	
	//通过@Value中的spring表达式引用其他bean属性。但要注意与占位符中的@Value("${xxx}")的区别。
	@Value("#{bookj001.bookName}")  
	private String bookName;
	@Value("#{bookj001.copyright}")
	private String copyright;
	@Value("#{bookj001.author}")
	private String author;
	@Value("#{bookj001.page}")
	private int page;	
	
	@Autowired   //织入Bean "spel001"
	@Qualifier("spel001")  
	private SpringExpressionLanguage springEL;	
	
	
	@Bean("bookj002")
	public Book bookj002() {
		return new Book(bookName, copyright,author, page); 
	}
	
	//通过@Autowired注入后，引用Bean实例springEL
	@Bean("basicDataAu")
	public BasicData basicDataAu() {
		return new BasicData(springEL.getStrArry()[1], 
				              springEL.getIntList().get(2), 
				              springEL.getBook());
	}
	
	//通过@Value注解中的SpEL表达式引用XML配置文件spring-SpEL.xml中的bean数据。
	@Bean("basicData")
	public BasicData basicData(@Value("#{spel002.strMap.get('liSi')}") String str,  //引用Map的key('liSi')值
							   @Value("#{spel001.intList.get(0)}") int i,  //引用列表list中的值
							   @Value("#{spel002.book}") Book book) //引用Bean对象属性
   {
		return new BasicData(str,i, book);
	}
	
	
}
