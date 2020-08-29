package spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("spring.core")
public class JavaConfig {

	@Bean
	@Scope("singleton")
	public Hello hello_Id() {
		return new Hello();
	}

	@Bean
	public Girl girl1(@Qualifier("hello_Id") Conversation conversation1) {
		return new Girl(conversation1);
	}

	@Bean
	@Scope("prototype")
	public Goodbye goodbye_Id() {
		return new Goodbye();
	}

	@Bean
	public Girl girl2(@Qualifier("goodbye_Id") Conversation conversation2) {
		return new Girl(conversation2);
	}

	@Bean
//	@Primary
	public Hello hello_Id3() {
		return new Hello();
	}

	@Bean
	public Girl girl3(Conversation conversation3) {
		return new Girl(conversation3);
	}

}
