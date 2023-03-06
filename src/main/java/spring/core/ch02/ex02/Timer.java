package spring.core.ch02.ex02;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//container 내에서 Aspect가 되야하는 bean에는 Aspect annotation을 붙인다.
@Aspect
@Component
public class Timer { //ex02 예제의 AOP에서 Timer로 만들어진 bean이 aspect이다.
	
	// AOP에서 Object clock을 advise라고 부른다. (주종관계에서 종)
	// ex02업무에서 clock은 혼자서 사용하지 않는다. 계산을 하거나 토끼가 잠을 자야 clock을 사용한다.
	// advise는 Around annotation을 붙인다. JoinPoint는 결합지점.
	// 주와 종이 결합하여 같이 실행되는 지점을 뜻한다. (종이 주의 앞에 올지 뒤에 올지 지점을 정한다.)
	@Around
	public Object clock(ProceedingJoinPoint jp) throws Throwable {
		
	}
}
