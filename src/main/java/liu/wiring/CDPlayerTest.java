package liu.wiring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import liu.wiring.SoundSystemConfig;
import liu.wiring.CompactDisc;
import liu.wiring.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=SoundSystemConfig.class)
public class CDPlayerTest {
	@Autowired
    private MediaPlayer mediaPlayer;
 
    @Autowired
    @Qualifier("heyGirl")
    private CompactDisc keyGirl;
 
    @Autowired
    @Qualifier("compactDisc")
    private CompactDisc cd;
 
    @Test
    public void beanTest() {
        mediaPlayer.play();
        cd.play();
        keyGirl.play();
    }
}
