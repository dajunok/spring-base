package liu.wiring.propertySource;

/**
 * 书桌
 * @author dajun
 *
 */
public class Desk {
	private String colour; //颜色
	private String Size;   //大小		
	public Desk(String colour, String size) {
		super();
		this.colour = colour;
		Size = size;
	}
	
	public String getColour() {
		return colour;
	}
	public String getSize() {
		return Size;
	}
	
	

}
