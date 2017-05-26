package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;
/*
 * ArrayList 는 List 인터페이스를 구현하였기 때문에
 * ArrayList 객체는 List type으로 받을 수 있다.
 * 주로 사용하는 메소드
 * .add()
 * .get()
 * .remove()
 * .size()
 * .clear()
 * 등의 메소드는 모두 List 인터페이스에 명시된 메소드 이다.
 */

public class MainClass04 {
	public static void main(String[] args) {
		//ArrayList 객체 생성해서 List type 변수에 참조값 담기
		List<Car> cars = new ArrayList<>();
		//주요 메소드 사용해보기
		cars.add(new Car("A"));
		cars.add(new Car("B"));
		cars.add(new Car("C"));
		
		Car c=cars.get(0);
		cars.remove(1);
		int size=cars.size();
		cars.clear();
		
		List<Car> cars2=new ArrayList<>();
		cars2.add(new Car("A"));
		cars2.add(new Car("B"));
		cars2.add(new Car("C"));
		
		Car k=cars2.get(1);
		cars2.remove(2);
		int size2=cars2.size();
		cars.clear();
		
	}
}
