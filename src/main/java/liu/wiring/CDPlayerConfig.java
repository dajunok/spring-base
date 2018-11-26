package liu.wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import liu.wiring.CompactDisc;
import liu.wiring.CDPlayer;

@Configuration
@Import(CDConfig.class)
public class CDPlayerConfig {
	@Bean(name="cDPlayer")
	public CDPlayer cdPlayer(CompactDisc heyGirl) {
		return new CDPlayer(heyGirl);
	}
}
