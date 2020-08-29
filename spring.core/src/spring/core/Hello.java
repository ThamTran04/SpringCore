package spring.core;

public class Hello implements Conversation {
	@Override
	public void say() {
		System.out.println("Hello, nice to meet you!!!");
	}
}
