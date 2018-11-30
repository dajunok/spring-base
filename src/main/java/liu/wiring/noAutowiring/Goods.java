package liu.wiring.noAutowiring;

/**
 * 商品
 * @author LIU
 *
 */
public class Goods {
	private String name;
	private String unit; //单位
	private double price; //价格
	private String kind;   //种类
	
	public Goods(String name, String unit, double price, String kind) {
		super();
		this.name = name;
		this.unit = unit;
		this.price = price;
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public String getUnit() {
		return unit;
	}

	public double getPrice() {
		return price;
	}

	public String getKind() {
		return kind;
	}

}
