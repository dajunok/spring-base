package liu.wiring.noAutowiring;

/**
 * 区域（范围）
 * @author LIU
 *
 */
public class Area {
	private Personnel charge;  //负责人
	private String name;    //区域名称
	private String floor;   //楼层
	private String position;  //位置
	
	public String getName() {
		return name;
	}
	public String getFloor() {
		return floor;
	}
	public String getPosition() {
		return position;
	}
	
	public void setCharge(Personnel charge) {
		this.charge = charge;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	

}
