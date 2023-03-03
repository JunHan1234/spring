package spring.core.ch01.ex05;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Container에 Configuration이라고 IoC해준다.
@Configuration
//필요한 경로의 package를 IoC해준다.
@ComponentScan("spring.core.ch01.ex05")
public class AppConfig {

}
