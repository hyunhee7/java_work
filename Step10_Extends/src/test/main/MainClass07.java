package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass07 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 참조값을 변수에 담기
		HandPhone p1 = new HandPhone();
		//ClassCastException 발생
		//SmartPhone p2 = (SmartPhone)p1; 
		
		
		
		
		//핸드폰객체를 스마트폰 으로 캐스팅은 불가능 / 원래객체가 handphone이니까 캐스팅안된다
		
	}
}
