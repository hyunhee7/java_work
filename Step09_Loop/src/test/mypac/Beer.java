package test.mypac;

public class Beer {
	//멤버필드
	public String type;
	//default 생성자
	public Beer(){
		
	}
	//String type data를 전달받는 생성자
	public Beer(String type){
		this.type=type;
	}
	
	//일반 멤버 메소드
	public void drink(){
		System.out.println(this.type+"맥주가 찬형이를 취하게 해요~");
		
	}
	
}
