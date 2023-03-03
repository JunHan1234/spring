package spring.core.ch01.ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import spring.core.ch01.ex01.Gun;
import spring.core.ch01.ex02.Shooter;

@Configuration
//Configuration들을 통합하려면 import annotation을 이용한다.
@Import({Config1.class, Config2.class})
public class AppConfig {
	//@Autowired를 보고 container가 자동으로 Gun type의 객체에 DI시켜준다. (@Autowired는 DI다.)
	@Autowired private Gun pistol;
	@Autowired private Gun rifle;
	
	//생성자 이용 방법
	@Bean
	public Shooter shooter1() {
		return new Shooter("최한석", pistol);
	}
	
	//setter 이용 방법
	@Bean
	public Shooter shooter2() {
		Shooter shooter = new Shooter();
		shooter.setShooterName("한아름");
		shooter.setGun(rifle);
		
		return shooter;
	}
}
