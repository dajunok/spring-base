package liu.wiring.SpEL;

import java.util.List;
import java.util.Map;
/**
 * spring表达式SpEL测试类
 * @author dajun
 *
 */
public class SpringExpressionLanguage {
	private int page;
	private long time;
	private String name;
	private List<Integer> intList;
	private String[] strArry;
	private Map<String, String> strMap;
	private Book book;
	
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getIntList() {
		return intList;
	}
	public void setIntList(List<Integer> intList) {
		this.intList = intList;
	}
	public String[] getStrArry() {
		return strArry;
	}
	public void setStrArry(String[] strArry) {
		this.strArry = strArry;
	}
	public Map<String, String> getStrMap() {
		return strMap;
	}
	public void setStrMap(Map<String, String> strMap) {
		this.strMap = strMap;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	

}














