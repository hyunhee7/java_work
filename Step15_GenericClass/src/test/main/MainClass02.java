package test.main;

import test.mypac.MyBox;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다");
		MyBox<String> box1=new MyBox<String>();
		
		//기본 data type으로 Generic 클래스를 지정 불가
		//MyBox<int> box2=new MyBox<int>();
		
		//기본 data type의 클래스 type을 wrapper 클래스라고 한다.
		Byte a=10;		// byte 의 객체형
		Short b=10; 	// short 의 객체형
		Integer c=10;	// long 의 객체형
		
		Long d=10l;		// float 의 객체형
		Double f=10.1d; // doble 의 객체형
		
		Character g='A'; // char 의 객체형
		Boolean h=true;  // boolean 의 객체형
		
		//기본 데이터 type의 객체형을 이용해서 Generic class 지정하기
		MyBox<Integer> box2=new MyBox<Integer>();
		box2.set(30);
		Integer result=box2.get();
		//int result=box2.get();
		System.out.println(result);
		
		//객체 생성시 Generic type 생략 가능
		MyBox<Boolean> box3=new MyBox<>();
		box3.set(true);
		Boolean result2=box3.get();
		System.out.println(result2);
		
	}
}
