package liu.aop.Designator;
/**
 * 农民：
 * @author LIU
 * 
 * Farmer：农民
 * Countryside：农村
 * cultivate：种地
 */
public class Farmer {
	private String name;  //姓名
	private String nativePlace;  //籍贯
	private CountrysideImpl countrysideImpl; 
	
	public Farmer(String name, String nativePlace) {
		super();
		this.name = name;
		this.nativePlace = nativePlace;
	}

	public String getName() {
		return name;
	}

	public String getNativePlace() {
		return nativePlace;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public void setCountrysideImpl(CountrysideImpl countrysideImpl) {
		this.countrysideImpl = countrysideImpl;
	}

	public CountrysideImpl getCountrysideImpl() {
		return countrysideImpl;
	}
	
	
	
}
