package liu.wiring.SpEL;
/**
 * 基础数据
 * @author dajun
 *
 */
public class BasicData {
	private String str;
	private int  i;
	private Book book;
	
	public BasicData(String str, int i, Book book) {
		super();
		this.str = str;
		this.i = i;
		this.book = book;
	}

	public String getStr() {
		return str;
	}

	public int getI() {
		return i;
	}

	public Book getBook() {
		return book;
	}


}
