package liu.wiring.autowiring.byType;

public class CDiscPlayer {
	//采用autowire="byType"属性注入时，只要是CompactDisc类型就可以注入，不要求在XML中必须找到id="compactDisc"这个名称
	private CompactDisc compactDisc; 
	public void setCompactDisc(CompactDisc compactDisc) {
		System.out.println("CDiscPlayer --> CompactDisc");
		this.compactDisc=compactDisc;
	}	
	public void play() {
		compactDisc.play();
	}
	
	//采用autowire="byType"属性注入时，只要是CompactDisc类型就可以注入，不要求在XML中必须找到id="digitalVideo"这个名称
	@SuppressWarnings("unused")
	private DigitalVideo digitalVideo;
	public void setDigitalVideo(DigitalVideo digitalVideo) {
		System.out.println("CDiscPlayer --> DigitalVideo");
		this.digitalVideo = digitalVideo;
	}
}
