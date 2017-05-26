package test.main;

import test.mypac.Wrapper;

import java.io.PrintStream;

import test.mypac.Car;
public class MainClass11 {
	public static void main(String[] args) {
		//Wrapper 클래스 안에 정의된 car 라는 이름의 
		//static 멤버필드를 참조해서 drive()라는 메소드를 호출해 보세요.
		Wrapper.car.drive();
		System.out.println("안녕하세요");
		
		PrintStream a = System.out;
		a.println("gura");
	}
}

