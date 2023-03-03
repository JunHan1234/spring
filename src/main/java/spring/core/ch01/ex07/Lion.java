package spring.core.ch01.ex07;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Lion implements InitializingBean, DisposableBean {
	//InitializingBean 에서 상속받은 method.
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("lion is born.");
	}

	//lion이 태어나서 할 일.
	public void shout() {
		System.out.println("lion shout.");
	}
	
	//DisposableBean 에서 상속받은 method.
	@Override
	public void destroy() throws Exception {
		System.out.println("lion is dead.");
	}
}
