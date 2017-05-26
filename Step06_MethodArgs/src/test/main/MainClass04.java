package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작되었습니다.");
		String a = "hello!";
		int b = 999;
		boolean c = false;
		
		//위에서 만들어진 변수명을 이용해서 test1() 메소드를 호출해보세요
		MainClass04.test1(a);
		//위에서 만들어진 변수명을 이용해서 test2() 메소드를 호출해보세요
		MainClass04.test2(b);
		//위에서 만들어진 변수명을 이용해서 test3() 메소드를 호출해보세요
		MainClass04.test3(c);
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
