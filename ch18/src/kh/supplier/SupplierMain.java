package kh.supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierMain {

	public static void main(String[] args) {
		//인터페이스(추상메소드1개) -> 구현클래스(오버라이딩) -> 부모= 자식구현 객체 -> 부모.추상메소드 
		//Supplier<T>(T get(): 추상메소드) -> 구현클래스(x) -> 부모= 자식구현 객체 -> 부모.추상메소드(람다식으로 표현)
		Supplier<String> sp = () -> {
				Scanner s = new Scanner(System.in);
				System.out.printf("이름입력: ");
				String name = s.nextLine();
				return String.format("%s님 안녕하심까",name);
		};
		String value = sp.get();
		
		System.out.println(value);
		
		System.out.println("The end");
	}

}
