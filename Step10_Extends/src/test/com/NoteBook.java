package test.com;

public class NoteBook extends Computer{
	//Cpu type을 인자로 전달 받는 생성자
	public NoteBook(Cpu cpu) {
		//부모 생성자를 호출하면서 Cpu의 참조값 전달하기
		//반드시 생성자의 첫번째 라인에 위치 해야한다.
		super(cpu);
	}
	//부모의 메소드 재정의 (오버라이딩 하기)
	@Override
	public void operation(){
		//부모의 원래 메소드 호출(선택사항)
		//super.operation();
		System.out.println("이동중에 연산을 해요");
	}
	
}
