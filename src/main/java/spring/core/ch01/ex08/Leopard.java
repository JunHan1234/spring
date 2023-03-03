package spring.core.ch01.ex08;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//IoC 했을때 default scope.
@Scope("singleton")
public class Leopard {

}
