package liu.wiring.propertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
/**
 * 属性源配置类：主要用于创建Bean
 * @author dajun
 *
 */
@Configuration
@PropertySource(value= {"classpath:/liu/wiring/propertySource/otherBook.properties",
						"classpath:/liu/wiring/propertySource/book.properties"
						},
				ignoreResourceNotFound=false,encoding="UTF-8",name="book.properties")
public class PropertySourceConfig {
	@Autowired
	private Environment env;
	
	@Bean("checkEnv")
	public Boolean checkEnvironment() {
		boolean authorExists =env.containsProperty("author"); //判断author属性是否存在
		String[] profiles=env.getDefaultProfiles(); //返回默认profile名称的数组		
		return true;
	}
	
	@Bean("book")
	public Book newBook() {
		return new Book(env.getProperty("bookName"), 
				env.getProperty("copyright"), 
				env.getProperty("author"), 
				env.getProperty("page",Integer.class));  		
	}
	
	@Bean("otherBook")
	public Book otherBook(@Value("${bookName}") String bookName,
						  @Value("${copyright}") String copyright,
						  @Value("${author}") String author,
						  @Value("${page}") int page) {		
		return new Book(bookName,copyright, author,page);		
	}


}
