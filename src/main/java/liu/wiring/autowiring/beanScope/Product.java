package liu.wiring.autowiring.beanScope;

/**
 * 产品
 * @author LIU
 *
 */
public class Product {
	private String name;
	
	public Product(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
