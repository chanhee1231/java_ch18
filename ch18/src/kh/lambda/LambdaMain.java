package kh.lambda;

import java.util.Scanner;

public class LambdaMain {
	public static void main(String[] args) {
		//임시객체 부 = new 자식()
		//입력 없다, 출력 없다 => 람다식
		A a = () -> System.out.println("입력 없고, 리턴 없다.");
		
		//부모.추상메소드를 불러주면 -> 자식의 오버라이딩 함수가 작동된다.
		a.method();
		
		D d = (c, b) ->c+b;
		double value = d.methodD(5,5.0);
		System.out.println(value);
		
		B b = (name) -> { 
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 국어점수:");
		int value2 = Integer.parseInt(scan.nextLine());
		return value2;
		};
		int value3 = b.methodB("국어");
		System.out.println(value3);
		int value4 = b.methodB("국어");
		System.out.println(value4);
		
		System.out.println("The end");
	}
}
