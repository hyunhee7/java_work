package test.main;

import test.mypac.Apple;
import test.mypac.Car;
import test.mypac.Orange;

public class MainClass07 {
	public static void main(String[] args) {
		//test1, test2 메소드를 각각 호출해 보세요.
		MainClass07.test1(new Car());
		MainClass07.test2(new Apple());
		// Orange type 을 인자로 전달받는 static 멤버 메소드를 만들고 
		// 호출해보세요
		MainClass07.test3(new Orange());
		
		test3(null);
		test2(null);
	}
	public static void test1(Car car){
		
	}
	public static void test2(Apple apple){
		
	}
	public static void test3(Orange orange){
		
	}
}
