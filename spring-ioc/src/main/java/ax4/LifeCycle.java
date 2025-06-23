package ax4;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifeCycle {

	public LifeCycle() {
		System.out.println("Life-cycle constructor");
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("Life-cycle init");
	}
	
	@PreDestroy
	public void teardown() {
		System.out.println("Life-cycle destroy");
	}
}
