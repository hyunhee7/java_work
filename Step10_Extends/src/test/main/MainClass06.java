package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 참조값을 Object type 변수에 담기
		Object p1 = new SmartPhone();
		//SmartPhone 객체를 생성해서 참조값을 Phone type 변수에 담기
		Phone p2 = new SmartPhone();
		//SmartPhone 객체를 생성해서 참조값을 HandPhone type 변수에 담기
		HandPhone p3 = new SmartPhone();
		//SmartPhone 객체를 생성해서 참조값을 SmartPhone type 변수에 담기
		SmartPhone p4 = new SmartPhone();
		
		//p1에 들어 있는 참조값을 Phone type으로 casting 해서
		//Phone type 변수에 담기
		Phone p5 = (Phone)p1;
		p5.call();
		
		HandPhone p6 = (HandPhone)p1;
		SmartPhone p7 = (SmartPhone)p1;
	}
}
