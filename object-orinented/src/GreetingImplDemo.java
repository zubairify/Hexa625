class GreetingImpl implements Greeting {
	@Override
	public void sayHello() {
		System.out.println("Simple greeting impl");
	}
}

public class GreetingImplDemo {
	private class GreetingInnerImpl implements Greeting {
		@Override
		public void sayHello() {
			System.out.println("Inner greeting impl");
		}
	}
	
	public void nestedDemo() {
		class GreetingNestedImpl implements Greeting {
			@Override
			public void sayHello() {
				System.out.println("Nested greeting impl");
			}
		};
		new GreetingNestedImpl().sayHello();
	}
	
	public void anonymousDemo() {
		Greeting g = new Greeting () {
			@Override
			public void sayHello() {
				System.out.println("Anonymous greeting impl");
			}
		};
		g.sayHello();
	}
	
	public static void main(String[] args) {
		GreetingImpl g1 = new GreetingImpl();
		g1.sayHello();
		
		GreetingImplDemo demo = new GreetingImplDemo();
		GreetingInnerImpl g2 = demo.new GreetingInnerImpl();
		g2.sayHello();
		
		demo.nestedDemo();
		demo.anonymousDemo();
		
		Greeting g3 = () -> System.out.println("Lambda greeting impl");
		g3.sayHello();
	}
}
