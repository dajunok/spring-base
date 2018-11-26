package liu.wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import liu.wiring.CompactDisc;
import liu.wiring.SgtPeppers;

@Configuration
public class CDConfig {
	@Bean
	public CompactDisc heyGirl() {
		return new SgtPeppers();
	}

}
