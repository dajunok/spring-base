package liu.wiring.autowiring.Condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	@Bean("peson")
    public Person person(){
        return new Person();
    }
 
    @Bean("cat")
    @Check("Siamese kitten")  //暹罗猫
    public Cat cat(){
        return new Cat();
    }
 
    @Bean("beautifulDog")
    @Check("collie")  //牧羊犬
    @Conditional({PetCondition.class})
    public Dog dog(){
        return new Dog("collie");
    }
}
