package myspring.di.annot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//설정클래스임을 나타내는 어노테이션
//<context:component-scan base-package="myspring.di.annot" />
@Configuration
@ComponentScan(basePackages = {"myspring.di.annot"})
public class HelloBeanConfig {

}
