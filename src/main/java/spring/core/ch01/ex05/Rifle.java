package spring.core.ch01.ex05;

import org.springframework.stereotype.Component;

@Component//("rifleGun") //ID 지정법. 속성명:value 속성값:rifleGun
public class Rifle implements Gun {
	@Override
	public void fire() {
		System.out.println("소총 탕탕.");
	}
}
