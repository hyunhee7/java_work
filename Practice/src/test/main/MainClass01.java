package test.main;

import test.com.Cpu;
import test.com.NoteBook;

public class MainClass01 {
	public static void main(String[] args) {
		new NoteBook(new Cpu()).operate();
	}
}
