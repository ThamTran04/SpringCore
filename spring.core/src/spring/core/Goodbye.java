package spring.core;

public class Goodbye implements  Conversation {

	@Override
	public void say() {
		System.out.println("Goodbye, see you soon!!");
	}

}
