package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		HandPhone p1 = new HandPhone();
		p1.call(); //Phone클래스에 정의된 기능 사용가능
		p1.mobileCall(); //HandPhone클래스에 정의된 기능 사용가능
		p1.takePicture(); //HandPhone클래스에 정의된 기능 사용가능
		
		SmartPhone p2 = new SmartPhone();
		p2.call(); //Phone클래스에 정의된 기능 사용가능
		p2.mobileCall(); //HandPhone클래스에 정의된 기능 사용가능
		p2.takePicture(); //HandPhone클래스에 정의된 기능 사용가능
		p2.doInternet(); //SmartPhone클래스에 정의된 기능 사용가능
	}
}
