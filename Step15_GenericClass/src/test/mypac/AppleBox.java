package test.mypac;

public class AppleBox {
	//접근 지정자가 private 이면 클래스(객체) 안에서만 접근 가능하다
	private Apple apple;
	
	// Apple 객체를 넣어주는 메소드
	public void push(Apple apple){
		this.apple=apple;
	}
	
	// Apple 객체를 리턴해주는 메소드
	public Apple pull(){
		return apple;
	}
	
}
