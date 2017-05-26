package test.main;

import test.com.Computer;
import test.com.Cpu;
import test.com.NoteBook;

public class MainClass09 {
	public static void main(String[] args) {
		//Cpu의 참조값을 전달하면서 NoteBook객체 생성하기
		NoteBook c1=new NoteBook(new Cpu());
		//메소드 호출하기
		c1.operation();
	}
}
