package spring.core.ch01.ex04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.core.ch01.ex01.Pistol;

@Configuration
public class Config1 {
	//IoC의 내용으로 pistol bean을 생성한다.(spring container가 pistol 객체를 control함.)
	@Bean
	public Pistol pistol() {
		return new Pistol();
	}
}
