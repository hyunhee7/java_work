package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		Car car1 = new Car("a");
		Car car2 = new Car("a");
		Car car3 = car1; // key값을 복사해줌
		
		boolean result = car1 == car2;
		boolean result2 = car1 == car3;
		
	}
}
