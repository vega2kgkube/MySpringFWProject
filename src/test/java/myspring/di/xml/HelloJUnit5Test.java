package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloJUnit5Test {

	@Test
	void helloBean() {
		//1. Container 객체생성
		ApplicationContext context = new GenericXmlApplicationContext("classpath:spring-beans.xml");
	}
}
