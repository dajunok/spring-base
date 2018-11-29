package liu.wiring.Importing;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 办公楼
 * 1、该配置类用于汇总办公楼中所有Bean（职员、办公室、部门）
 * @author LIU
 *
 */

@Configuration
@Import({DepartmentConfig.class})
@ImportResource(locations="classpath:/liu/wiring/Importing/spring-office.xml")
public class OfficeBuilding {

}
