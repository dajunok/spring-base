package liu.wiring.propertySource;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 应用类：用于创建属性配置文件
 * @author dajun
 *
 */
public class TestProperty {

	public static void main(String[] args) throws IOException {
		Properties settings=new Properties();
		settings.put("bookName", "Java Web");
		settings.put("copyright", "清华大学出版社出版");
		settings.put("author", "张志锋");
		settings.put("page", "878");	
		FileOutputStream out=new FileOutputStream("D:\\Java\\SringProjects\\spring-base\\src\\main\\java\\liu\\wiring\\environment\\otherBook.properties");
		settings.store(out, "Book Properties");

	}

}
