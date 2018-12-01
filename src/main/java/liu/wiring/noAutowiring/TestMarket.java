package liu.wiring.noAutowiring;

public class TestMarket {

	public static void main(String[] args) {
		Customer customer=Market.getCustomer();
		System.out.println(customer.getName());

	}

}
