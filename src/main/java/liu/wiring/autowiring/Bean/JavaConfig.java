package liu.wiring.autowiring.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

/**
 * JavaConfig配置文件，用于定义Bean
 * @author LIU
 *
 */
@Configuration
public class JavaConfig {	
	@Value("特朗普")
	private String name;
	
	@Autowired
	@Qualifier("myfriend")
	private Member member;
	
	
	
	@Bean(name="myfamily")
	public Family family() {
		return new Family();
	}
	
	@Bean(name= {"gf","gfam","fly"}) //定义多个别名
	public Family goodFamily() {
		return new Family(member);  //引入上面注入的bean实例member
	}
		
	@Bean(name="myfriend")
	public Member member() {
		return new Member(name);
	}
	
	@Bean(initMethod="beanInit",destroyMethod="beanDestroy")
	@Description("Bean的描述：bean生命周期回调测试类")
	public BeanLifecycle bLifecycle() {
		return new BeanLifecycle();
	}

}