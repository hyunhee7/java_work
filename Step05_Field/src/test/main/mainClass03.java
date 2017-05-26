package test.main;

import test.gura.Util;

public class mainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//Util 클래스의 static 멤버필드 참조
		int a = Util.version;
		//Util 클래스의 static 멤버 메소드 호출
		Util.sendMessage();
		
		System.out.println("메인 메소드가 리턴 됩니다.");
		
	}
}
