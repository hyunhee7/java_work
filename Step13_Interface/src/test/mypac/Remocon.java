package test.mypac;
/*
 * [ interface ] 
 * 
 * - 생성자가 없다 (객체 생성 불가)
 * - 추상 메소드만 정의할 수 있다.
 * - 필드는 static final 멤버필드만 가질 수 있다.
 * - 데이터 type 역할을 할 수 있다.
 */
public interface Remocon {
	//필드 정의하기 
	//final붙이면 한번 들어간 값 고칠수없음.
	//관례상 final이 들어간 변수는 대문자로 씀
	//interface에서 static final 생략가능 
	public static final String COMMPANY="LG";
	public int VERSION=1; //static final 생략됨
	//메소드 정의하기 //구현하면 안되고 형태만 접근지정자, 리턴타입, 메소드 이름, 어떤인자 전달해야하는지만 입력
	public abstract void up(); //여기 있는 메소드는 모두 추상메소드
	public void down();// abstract 생략 가능
	
}

