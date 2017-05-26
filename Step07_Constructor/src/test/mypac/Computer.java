package test.mypac;

public class Computer {
	//컴퓨터 멤버필드로 cpu, memory, harddisk
	public Cpu cpu;
	public Memory memory;
	public HardDisk harddisk;

	// Cpu, Memory, HardDisk type 데이터를 전달 받는 생성자 정의
	public Computer(Cpu cpu, Memory memory, HardDisk harddisk){
		this.cpu=cpu;
		this.memory=memory;
		this.harddisk=harddisk;
	}
}
