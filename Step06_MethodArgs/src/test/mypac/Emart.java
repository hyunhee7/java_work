package test.mypac;
/*
 * this 라는 예약어는 해당 클래스로 객체가 생성되었을 때
 * 생성된 객체의 참조값을 지칭하는 예약어이다.
 */
public class Emart {
	
	//주문하는 메소드
	public void order(){
		System.out.println("order메소드 호출됨");
		make();
		this.deliver();
	}
	//상품을 만드는 메소드
	public void make(){
		System.out.println("make메소드 호출됨");
	}
	//상품을 배달하는 메소드
	public void deliver(){
		System.out.println("deliver메소드 호출됨");
	}
}

