package liu.aop.Designator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 配置类：主要用于定义bean。
 * @author LIU
 *
 */

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
	@Bean   
	public AspectJConfig aspectJConfig() {  //定义切面Bean
		return new AspectJConfig();
	}
	
	@Bean("countryside")  //农村
	public  Countryside byCountryside() {
		return new CountrysideImpl();
	}	
	@Bean("farmer")  //农民
	public Farmer  farmer(@Value("#{'陈永贵'}") String name,
			              @Value("#{'山西'}") String nativePlace) {
		return new Farmer(name, nativePlace);
	}
	
	@Bean("city")   //城市
	public City byCity() {
		return new CityImpl();
	}
	@Bean("worker")  //工人
	public Worker byWorker(@Value("#{'张秉贵'}") String name,
						   @Value("#{'售货员'}") String workKind,
			               @Value("#{28}") int age) {
		return new Worker(name, workKind, age);
	}
	
	@Bean("school")  //学校
	public School bySchool() {
		return new Schoolimpl();
	}
	@Bean("student")
	public Student byStudent(@Value("#{'李学霸'}") String name,
			                 @Value("#{'66班'}") String classes,
			                  @Value("#{676}")  Integer totalScore) {
		return new Student(name, classes, totalScore);
	}
	
	@Bean("troops")  //部队
	public Troops byTroops() {
		return new TroopsImpl();
	}
	@Bean("soldier")  //军人
	public Soldier bySoldier(@Value("#{'黄继光'}") String name,
			   @Value("#{'中士'}") String militaryRank) {
		return new Soldier(name, militaryRank);
	}
	
}
