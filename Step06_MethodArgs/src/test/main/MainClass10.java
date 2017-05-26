package test.main;

import test.mypac.Car;

public class MainClass10 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2;
		Car car3 = null;
		
		car1.drive();
		//car2.drive(); //선언만하면 사용불가능 
		car3.drive(); //문법은 성립, but 키값이 없으므로 이용 불가능 
	}
}
