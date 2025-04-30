package kh.lambda;

public class InstanceLambdaMain {

	public static void main(String[] args) {
		//람다식(함수형 인터페이스를 이용하다 이제는 인스턴스 메소드(out.println()를 이용한다)
		
		C c = a -> System.out.println(a);
		
		C c2 = System.out::println;
		
		c.methodC(10);
		c2.methodC(20);
		//======================================
		System.out.println("==============================");
		A a = () -> Bobject.bcd();
		
		A a2 = Bobject::bcd;
		a.method();
		a2.method();
		System.out.println("==============================");
		
		System.out.println("The end");
	}

}
