package kh.consumer;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//인터페이스 -> 구현클래스 -> 구현 객체 -> 부-자 관계->부.추상메소드();
		//Consumer -> 구현클래스x -> 구현객체 o(부자관계 포함) -> 부.추상메소드();
		
		Consumer<String> con = t -> System.out.printf("%s님 환영.\n",t);
	
		con.accept("찬희");
		System.out.println("========================================");
		Consumer<Integer> con1 = t -> {
			System.out.printf("%d단 출력\n",t);
				for(int i=0;i<9;i++) {					
					System.out.printf("%d * %d = %d \n",t,i+1,t*(i+1));
				}
		}; 
		System.out.print("단을 입력하십시오.");
		int value = Integer.parseInt(scan.nextLine());
		con1.accept(value);
		System.out.println("========================================");
		IntConsumer icon = t -> {
				System.out.printf("%d단 출력\n",t);
				for(int i=0;i<9;i++) {					
					System.out.printf("%d * %d = %d \n",t,i+1,t*(i+1));
				}
		};
		icon.accept(10);
		System.out.println("========================================");
		BiConsumer<String, Integer> bcon = (name, age) -> System.out.printf("%s의 나이는 %d세입니다.\n",name,age);
		bcon.accept("찬희", 25);
		System.out.println("The end");
	}

}
