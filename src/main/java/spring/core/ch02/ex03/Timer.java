package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("execution(* spring..*(int))") //class관점
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각: " + LocalDateTime.now());
	}
	//pointcut의 또다른 문법. Calculator class 안의 모든 method를 지칭해봤다.
	@After("within(spring..Calculator)") //method관점
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	//joinPoint에서 값을 return하는 경우(실행성공한 경우) 붙어서 발생시킬 advice.
	//AfterReturning이 After보다는 일찍 실행됨을 확인할 수 있다.
	@AfterReturning(pointcut="bean(calc*)", returning="result") //bean관점, return값에 이름을 지정
	public void printResult(JoinPoint jp, int result) { //joinPoint의 return 값이 int이므로, result도 int로 설정했다.
		System.out.println(jp.toShortString() + ": " + result);
	}
}
