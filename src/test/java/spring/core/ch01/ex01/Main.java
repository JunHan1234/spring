package spring.core.ch01.ex01;

public class Main {
	public static void main(String[] args) {
		Pistol pistol = new Pistol();
		Rifle rifle = new Rifle();
		
		//shooter와 pistol을 생성자 DI를 거쳐 관계를 맺어준다.
		Shooter shooter = new Shooter(pistol);
		shooter.fire();
		
		//shooter와 rifle을 setter method를 이용해 DI 시켜 관계를 형성한다.
		shooter.setGun(rifle);
		shooter.fire();
	}
}
