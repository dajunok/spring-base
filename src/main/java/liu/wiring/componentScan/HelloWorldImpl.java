package liu.wiring.componentScan;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("hello world!");

	}

}
