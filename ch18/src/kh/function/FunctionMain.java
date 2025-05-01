package kh.function;

import java.util.function.Function;

public class FunctionMain {

	public static void main(String[] args) {
		// function<T,R> -> R apply(T t) 추상메소드

		Function<String, Integer> func =  t -> t.length();
		System.out.println(func.apply("안녕"));
	}

}
