package test.mypac;

public class AttackUnit {
	//일반 멤버필드
	public int energy;
	public String name;

	//인자로 아무것도 전달 받지 않는 default 생성자1
	public AttackUnit(){
		
	}
	//인자로 int type data를 전달받는 생성자2
	public AttackUnit(int energy){
		this.energy=energy;//this는 이 클래스로 생성된 객체의 참조값의 예약어
	}
	//인자로 String type data를 전달받는 생성자3
	public AttackUnit(String name){
		this.name=name;
	}
	//인자로 int type 과 String type 을 전달 받아서
	//멤버필드에 저장하는 생성자를 정의해 보세요.
	public AttackUnit(int energy, String name){
		this.energy=energy;
		this.name=name;
	}
	//생성자가 다중정의 = 생성자가 오버로딩되어있다.
	
	//일반 멤버 메소드
	public void attack(){
		System.out.println("공격해요!");
	}
	
}

