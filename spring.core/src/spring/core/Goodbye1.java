package spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Goodbye1 implements Conversation {

	@Override
	public void say() {
		System.out.println("Goodbye, see you soon!!");
	}

}