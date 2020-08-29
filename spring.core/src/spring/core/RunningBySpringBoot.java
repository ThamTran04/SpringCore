package spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//https://loda.me/spring-huong-dan-lap-trinh-spring-can-ban-cho-nguoi-moi-loda1553413406068/
@SpringBootApplication
public class RunningBySpringBoot implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RunningBySpringBoot.class, args);
	}

	@Autowired
	private ApplicationContext context;

	@Override
	public void run(String... args) throws Exception {
		Girl girl = context.getBean(Girl.class);
		System.out.println(girl);
	}

}
