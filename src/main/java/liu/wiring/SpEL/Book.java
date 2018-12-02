package liu.wiring.SpEL;

/**
 * 书籍
 * @author dajun
 *
 */
public class Book {
	private String bookName;	 //书名
	private String copyright;    //出版社
	private String author;       //作者
	private int page;            //书籍页数

	public Book(String bookName, String copyright, String author, int page) {
		super();
		this.bookName = bookName;
		this.copyright = copyright;
		this.author = author;
		this.page = page;
	}
	public String getBookName() {
		return bookName;
	}
	public String getCopyright() {
		return copyright;
	}
	public String getAuthor() {
		return author;
	}
	public int getPage() {
		return page;
	}

}
