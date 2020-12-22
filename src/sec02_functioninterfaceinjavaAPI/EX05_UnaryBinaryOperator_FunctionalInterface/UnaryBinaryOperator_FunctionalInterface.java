package sec02_functioninterfaceinjavaAPI.EX05_UnaryBinaryOperator_FunctionalInterface;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryOperator_FunctionalInterface {
	public static void main(String[] args) {
		
		//#1. 익명이너클래스를 이용한 객체 생성  Function<T, T> = UnaryOperator<T>
		UnaryOperator<Integer> uo = new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t) {				
				return t*2;
			}
		};
		
		BinaryOperator<String> bo = new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t+u;
			}
		};
		System.out.println(uo.apply(5)); //10
		System.out.println(bo.apply("안녕", "하세요")); //안녕하세요
		System.out.println();
		
		//#2. 람다식
		//@1. 기본형
		UnaryOperator<Integer> uo1 = value -> value*2;
		System.out.println(uo1.apply(5)); //10
		
		BinaryOperator<String> bo1 = (value1, value2)->value1+value2;
		System.out.println(bo1.apply("안녕", "하세요")); //안녕하세요
		System.out.println();
		
		//@2. 확장형
		IntUnaryOperator uo2 = (num)->num*10; //int->int
		LongUnaryOperator uo3 = (num)->num+20L; //long->long
		DoubleUnaryOperator uo4 = (num)->num*10.0; //double->double
		System.out.println(uo2.applyAsInt(10)); //100
		System.out.println(uo3.applyAsLong(20L)); //40
		System.out.println(uo4.applyAsDouble(30.5)); //305.0
		System.out.println();
		
		IntBinaryOperator bo2 = (num1, num2)->num1+num2; //int->int
		LongBinaryOperator bo3 = (num1, num2)->num1*num2; //long->long
		DoubleBinaryOperator bo4 = (num1, num2)->num1/num2; //double->double
		System.out.println(bo2.applyAsInt(10, 20)); //30
		System.out.println(bo3.applyAsLong(20L, 10L)); //200
		System.out.println(bo4.applyAsDouble(40.2, 12.0)); //3.35		
	}
}






















