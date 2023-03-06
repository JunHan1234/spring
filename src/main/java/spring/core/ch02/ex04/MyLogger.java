package spring.core.ch02.ex04;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogger {
	private final Logger logger;
	
	public MyLogger() {
		logger = LogManager.getLogger(MyLogger.class);
	}
	
	//Log annotation이 붙어있는 것을 joinpoint로 삼겠다.
	@After("@annotation(spring.core.ch02.ex04.Log)")
	public void log(JoinPoint jp) {
		logger.info(jp.toShortString());
	}
	//AfterReturning의 반대.
	@AfterThrowing(pointcut="@annotation(spring.core.ch02.ex04.Log)", throwing="ex")
	public void logError(JoinPoint jp, Throwable ex) { //throwing = Throwable 변수명 일치해야함.
		logger.error(jp.toLongString() + ": " + ex.getMessage());
	}
}
