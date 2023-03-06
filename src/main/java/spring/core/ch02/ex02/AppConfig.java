package spring.core.ch02.ex02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.core.ch02.ex02")
//container가 이 annotation 코드를 읽고 AOP를 처리할 수 있는 준비를 마친다.
@EnableAspectJAutoProxy
public class AppConfig {

}
