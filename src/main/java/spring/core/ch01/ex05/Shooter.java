package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	//container에 Gun type bean이 두개이므로 2차로 bean의 ID와 Gun의 name이 같게 만들어줬다.
	//@Nullable은 DI할 container bean이 없을경우, null값을 내놓는다.
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifle;
	
	public void fire() {
		try {
			pistol.fire();
			rifle.fire();
		} catch(NullPointerException e) {
			
		}
	}
}
