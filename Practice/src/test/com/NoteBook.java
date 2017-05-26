package test.com;

public class NoteBook extends Computer{

	public NoteBook(Cpu cpu) {
		super(cpu);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void operate() {
		// TODO Auto-generated method stub
		System.out.println("이동중 연산을 해요!");
	}
	
}
