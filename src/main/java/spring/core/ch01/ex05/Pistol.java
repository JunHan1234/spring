package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component
//bean 의 아이디는 pistol이 된다. (class명에서 첫글자가 소문자로 변환됨.)
public class Pistol implements Gun {
	public void fire() {
		System.out.println("권총 탕탕.");
	}
}
