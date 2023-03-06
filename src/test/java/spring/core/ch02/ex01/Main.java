package spring.core.ch02.ex01;

public class Main {
	public static void main(String[] args) {
		//OOP 방식의 진행. 객체부터 생성한다.
		//OOP의 문제: start method가 중복된다.
		// => 이 start Aspect의 중복도 제거하고 싶다! AOP의 등장.
		Calculator calculator = new Calculator();
		Rabbit rabbit = new Rabbit();
		
		calculator.start();
		rabbit.start();
	}
}
