package test.main;

public class MainClass03 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		//test1()메소드를 호출해보세요
		MainClass03.test1("hello"); //id값 전달
		//test2() 메소드를 호출해 보세요
		MainClass03.test2(10); //value값 전달
		//test3() 메소드를 호출해 보세요
		MainClass03.test3(true);
	}
	public static void test1(String msg){
		String a = msg;
	}
	public static void test2(int num){
		int a = num;
	}
	public static void test3(boolean isRun){
		boolean a = isRun;
	}
}
