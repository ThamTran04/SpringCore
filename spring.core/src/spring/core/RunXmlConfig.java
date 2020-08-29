package spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunXmlConfig {
	public static void main(String[] args) {

		ApplicationContext context1 = new ClassPathXmlApplicationContext("xml_config.xml"); // config with only xml file
		Girl g1 = (Girl) context1.getBean("girl1");

		ApplicationContext context2 = new ClassPathXmlApplicationContext("xml_and_annotation.xml");
		Girl8 g2 = (Girl8) context2.getBean("girl8");

		ApplicationContext context3 = new AnnotationConfigApplicationContext(JavaConfig.class);
		Girl g3 = (Girl) context3.getBean("girl1");

		g3.getSetting().say();
	}
}
