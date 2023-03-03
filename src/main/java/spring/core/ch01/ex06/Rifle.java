package spring.core.ch01.ex06;

//내가 만든 annotation을 붙여 IoC를 안함을 명시.
@NoComponent
public class Rifle {
	public void fire() {
		System.out.println("소총 탕탕");
	}
}
