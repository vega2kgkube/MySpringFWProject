package myspring.di.xml;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

//static import
import static org.junit.jupiter.api.Assertions.*;

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
		assertSame(helloById, helloByType);
		
		//<property name="name" value="스프링" /> 설정을 테스트 한 것임
		//값 비교하기
		assertEquals("Hello 스프링", helloByType.sayHello());
	}
}
