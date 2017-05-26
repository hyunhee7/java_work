package test.main;

import test.mypac.Car;

public class MainClass01 {
	public static void main(String[] args) {
		//Car 클래스의 default 생성자(Constructor) 호출해서 객체 생성
		new Car();
		new Car().drive();
		Car a = new Car();
		a.drive();
		a.drive();
	}
}

