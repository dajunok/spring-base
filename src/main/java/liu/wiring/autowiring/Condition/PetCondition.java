package liu.wiring.autowiring.Condition;

import java.util.Map;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.StandardMethodMetadata;

/* ConditionContext参数对象：
	借助getRegistry()返回的BeanDefinitionRegistry检查bean定义；
	借助getBeanFactory()返回的ConfigurableListableBeanFactory检查bean是否存在， 甚至探查bean的属性；
	借助getEnvironment()返回的Environment检查环境变量是否存在以及它的值是什么；
	读取并探查getResourceLoader()返回的ResourceLoader所加载的资源；
	借助getClassLoader()返回的ClassLoader加载并检查类是否存在。
*AnnotatedTypeMetadata参数对象：
*	则能够让我们检查带有@Bean注解的方法上还有什么其他的注解。 
*	借助isAnnotated()方法， 我们能够判断带有@Bean注解的方法是不是还有其他特定的注解。
 * 
 */
public class PetCondition implements Condition{

	/**
	 * 
	 */
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();  //获取ioc使用的beanFactory
        Cat  cat=(Cat)beanFactory.getBean("cat");
        //Dog dog=(Dog)beanFactory.getBean("beautifulDog");  //不能是@Conditional对应中的Bean，因为尚未加载
        //liu.wiring.autowiring.Condition.Cat
        System.out.println("IOC容器中加载的Bean——>Cat："+cat.getName());
        Boolean bl=beanFactory.containsBean("peson"); //IOC容器中是否存在"peson"这个Bean
        System.out.println("Bean==>peson是否存在："+bl);       
        
        StandardMethodMetadata smMetadata = (StandardMethodMetadata)metadata; 
        //AppConfig下的dog方法调用，输出dog
        Boolean isBoolean=smMetadata.isAnnotated("liu.wiring.autowiring.Condition.Check");
        System.out.println("Bean是否包含@Check注解： "+isBoolean);  
        System.out.println(smMetadata.getMethodName());
        
        
        ClassLoader classLoader = context.getClassLoader(); //获取类加载器
        
        
        ResourceLoader resourceLoader=context.getResourceLoader(); //获取资源加载器
        //资源加载器：class org.springframework.context.annotation.AnnotationConfigApplicationContext
        System.out.println("资源加载器："+resourceLoader.getClass());
        
        
        BeanDefinitionRegistry registry = context.getRegistry(); //获取bean定义的注册类
        boolean isBean=registry.containsBeanDefinition("peson");  //判断"peson"这个bean是否存在
        
        Environment environment = context.getEnvironment(); //获取当前环境信息      
        //获得当前系统名
        String property = environment.getProperty("os.name");
        //包含Windows则说明是windows系统，返回true
        if (property.contains("Windows")){
            return true;
        }
        return true;
        //如果person
        //return context.getRegistry().containsBeanDefinition("person") && !context.getRegistry().containsBeanDefinition("cat");


	}

}
