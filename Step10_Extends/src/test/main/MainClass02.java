package test.main;

import test.mypac.Phone;

public class MainClass02 {
	public static void main(String[] args) {
		//Phone 객체를 생성해서 참조값을 Phone type 변수에 담기
		Phone a = new Phone();
		//a에 들어있는 참조값을 Object type 변수에 담기
		Object b = a;
		//a는 Phone type임으로 call() 메소드 호출가능
		a.call();
		//b는 Object type 임으로 call() 메소드 호출불가
		//b.call();
	}
}
