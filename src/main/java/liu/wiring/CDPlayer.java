package liu.wiring;

import liu.wiring.CompactDisc;
import liu.wiring.MediaPlayer;

public class CDPlayer implements MediaPlayer {
	private CompactDisc cd;
	
	public CDPlayer(CompactDisc cd) {
		this.cd=cd;
	}
	
	public void play() {
		cd.play();
	}

}
