package myspring.di.xml;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloJUnit5Test {

	@Test
	void helloBean() {
		//1. Container 객체생성
		ApplicationContext context = new GenericXmlApplicationContext("classpath:spring-beans.xml");
		//2. Container가 생성한 Hello 스프링빈을 요청하기
		Hello helloById = (Hello)context.getBean("hello");
		Hello helloByType = context.getBean("hello", Hello.class);
		
		//주소를 비교해서 Singleton 인지 확인하기
		System.out.println(helloById == helloByType);
		//Assertions.assertSame() 사용
		Assertions.assertSame(helloById, helloByType);
		
	}
}
