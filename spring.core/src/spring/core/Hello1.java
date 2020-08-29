package spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Hello1 implements Conversation {
	@Override
	public void say() {
		System.out.println("Hello, nice to meet you!!!");
	}
}
