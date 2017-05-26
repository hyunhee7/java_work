package test.com;

public class Computer {
	private Cpu cpu;
	public Computer(Cpu cpu){
		this.cpu=cpu;
	}
	
	public void operate(){
		System.out.println("연산을 해요");
	}
}
