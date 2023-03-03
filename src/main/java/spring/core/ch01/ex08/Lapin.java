package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//prototype으로 scope을 변경하면 getBean이 call 될때마다 새로운 주소값을 return.
@Scope("prototype")
public class Lapin {

}
