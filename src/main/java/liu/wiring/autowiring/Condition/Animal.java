package liu.wiring.autowiring.Condition;

/**
 * 动物
 * @author LIU
 *
 */
public class Animal {
	private String name;
	 
    public String getName() {
        return this.getClass().getName();
    }
 
    public void setName(String name) {
        this.name = name;
    }
}