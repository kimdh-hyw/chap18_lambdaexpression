package sec01_lambdaexpression.EX02_FunctionToLambdaExpression;

/*함수형 인터페이스의 객체를 생성하기 위한 람다식 표현 방법*/

interface A { // 입력 X   리턴 X
	void method1();
}
interface B { // 입력 O   리턴 X
	void method2(int a);
}
interface C { // 입력 X   리턴 O
	int method3();
}
interface D { // 입력 O   리턴 O
	double method4(int a, double b);
}

public class FunctionToLambdaExpression {
	public static void main(String[] args) {
		
		//인터페이스의 함수 구현 --> 람다식
		//#1. 입력 X   리턴 X
		//@1-1 익명이너클래스 방식
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 x 리턴 x 함수");				
			}
		};
		//@1-2  람다식 표현
		A a2 = ()->{System.out.println("입력 x 리턴 x 함수");};
		A a3 = ()->System.out.println("입력 x 리턴 x 함수"); //중괄호 삭제 가능 (한줄 명령일때만 가능)
		
		//@1-3. 메서드 호출
		a1.method1();
		a1.method1();
		a1.method1();
		System.out.println();		
		
		
		//#2. 입력 O   리턴 X
		//@2-1 익명이너클래스 방식
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력 O 리턴 x 함수");		
			}
		};	
				
		//@2-2  람다식 표현
		B b2 = (int a)->{System.out.println("입력 O 리턴 x 함수");};
		B b3 = (a)->{System.out.println("입력 O 리턴 x 함수");}; //입력매개변수 생략 가능
		B b4 = (a)->System.out.println("입력 O 리턴 x 함수"); //중괄호 삭제 가능 (한줄 명령일때만 가능)
		B b5 = a->System.out.println("입력 O 리턴 x 함수"); //입력 매개변수가 하나인 경우 소괄호도 생략가능
		
		
		//@3-3. 메서드 호출
		b1.method2(3);
		b2.method2(3);
		b3.method2(3);
		b4.method2(3);
		b5.method2(3);
		System.out.println();
		
		
		
		//#3. 입력 X   리턴 O
		//@3-1 익명이너클래스 방식
		C c1 = new C() {
			@Override
			public int method3() {
				return 4;
			}
		};
		
		//@3-2  람다식 표현
		C c2 = ()->{ return 4; };
		C c3 = ()->4;
		
		//@3-3. 메서드 호출
		c1.method3();
		c2.method3();
		c3.method3();
		System.out.println();
		
		
		//#4. 입력 O   리턴 O
		//@4-1 익명이너클래스 방식
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {				
				return a+b;
			}
		};
		
		//@4-2  람다식 표현
		D d2 = (int a, double b)->{return a+b;};
		D d3 = (a, b)->{return a+b;};
		D d4 = (a, b)-> a+b;
		
		//@4-3. 메서드 호출
		d1.method4(2, 3.8);
		d2.method4(2, 3.8);
		d3.method4(2, 3.8);
		d4.method4(2, 3.8);
				
	}
}

