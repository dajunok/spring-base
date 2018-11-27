package liu.wiring.autowiring.byName;

public class CDiscPlayer {
	//采用autowire="byName"属性注入时，	在XML中必须找到id="compactDisc"这个名称的Bean才能注入
	private CompactDisc compactDisc; 
	public void setCompactDisc(CompactDisc compactDisc) {
		System.out.println("CDiscPlayer --> CompactDisc");
		this.compactDisc=compactDisc;
	}	
	public void play() {
		compactDisc.play();
	}
	
	@SuppressWarnings("unused")
	private DigitalVideo digitalVideo;
	public void setDigitalVideo(DigitalVideo digitalVideo) {
		System.out.println("CDiscPlayer --> DigitalVideo");
		this.digitalVideo = digitalVideo;
	}
}
