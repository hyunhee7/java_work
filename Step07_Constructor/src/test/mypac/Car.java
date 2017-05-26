package test.mypac;
/*
 *  생성자
 *  
 *  1. 클래스명과 동일하다
 *  2. 생성자를 명시적으로 정리하지 않으면 default 생성자는 있다고 간주된다.
 *  3. 객체가 생성되는 시점에 호출되어서 실행순서가 들어온다.
 *  4. 객체가 생성되는 시점에 초기화 작업을 해줄 때 명시적으로 정의해서 사용한다.
 *  5. 메소드와 모양의 차이점은 리턴 type 이 없는 것이다.
 */
public class Car {
	//default 생성자
	public Car(){
		System.out.println("car() 생성자 호출됨");
	}
	//메소드
	public void drive(){
		System.out.println("method 호출");
	}
}


