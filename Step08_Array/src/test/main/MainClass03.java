package test.main;

import test.mypac.Car;

public class MainClass03 {
	public static void main(String[] args) {
		// Car type 객체의 참조값을 담을 수 있는 방 3개짜리 배열객체를 
		// 생성해서 참조값을 변수에 담아 보세요
		Car[] cars=new Car[3];
		
		//배열의 각각의 방에 Car 객체의 참조값을 담아 보세요
		cars[0]=new Car();
		cars[1]=new Car(2);
		cars[2]=new Car(3,"audi");
		
		cars[0].drive();
		cars[1].drive();
		cars[2].drive();
		
		Car[] cars2=new Car[3];
		Car c = new Car();
		cars2[0]=c;
		cars2[1]=c;
		cars2[2]=c;
		
		c.drive();
		cars2[0].drive();
		cars2[1].drive();
		cars2[2].drive();
	}
}
