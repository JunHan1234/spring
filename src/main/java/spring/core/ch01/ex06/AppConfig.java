package spring.core.ch01.ex06;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//내가 만든 annotation을 container에 알려주는 법.
@ComponentScan(basePackages="spring.core.ch01.ex06",
		//내가 만든 annotation을 IoC할 때 exclude(제외)한다.
		excludeFilters=@Filter(type=FilterType.ANNOTATION,
								classes=(NoComponent.class)))
public class AppConfig {

}
