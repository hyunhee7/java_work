package test.main;

import test.mypac.Emart;

public class MainClass01 {
	public static void main(String[] args) {
		//메소드 호출하면서 아무것도 전달하지 않기
		MainClass01.test1();
		//메소드 호출하면서 int type value 전달하기
		MainClass01.test2(10);
		new MainClass01().test3();
		//m1.test3();
		new Emart().order();
	}
	public static void test1(){
		
	}
	public static void test2(int num){
		
	}
	public void test3(){
		System.out.println("test3() 메소드가 호출됨");
	}
}
