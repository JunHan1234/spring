package spring.core.ch01.ex01;

public class Shooter {
	private Gun gun;
	
	//생성자 이용한 DI.(Dependency Injection)
	public Shooter(Gun gun) {
		this.gun = gun;
	}
	
	//setter 이용한 DI.
	public void setGun(Gun gun) {
		this.gun = gun;
	}
	
	public void fire() {
		gun.fire();
	}
}
