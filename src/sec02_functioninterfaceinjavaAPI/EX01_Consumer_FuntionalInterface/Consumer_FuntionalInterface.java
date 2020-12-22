package sec02_functioninterfaceinjavaAPI.EX01_Consumer_FuntionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class Consumer_FuntionalInterface {
	public static void main(String[] args) {

		//#1. 익명이너클래스를 이용한 객체 생성
		Consumer<String> c = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);	
			}
		};
		
		//#2. 람다식 표현
		//@1. 기본 Consumer
		Consumer<String> c1 = t->System.out.println(t);
		c1.accept("Consumer<T> 함수형 인터페이스");
		
		//@2. 확장형 Consumer
		IntConsumer c2 = num->System.out.println("int 값="+num);
		LongConsumer c3 = num->System.out.println("long 값="+num);
		DoubleConsumer c4 = num->System.out.println("double 값="+num);
		BiConsumer<String, Integer> c5 = (name, age)->System.out.println("이름="+name + " 나이="+age);
		
		c2.accept(5);
		c3.accept(5L);
		c4.accept(7.8);
		c5.accept("홍길동", 16);				
	}
}
