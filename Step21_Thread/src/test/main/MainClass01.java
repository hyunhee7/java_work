package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");

		MainClass01.test();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("메인 메소드가 종료됩니다.");
	}
	public static void test(){
		System.out.println("test() 메소드가 시작 되었습니다.");
		System.out.println("test() 메소드가 종료 되었습니다.");
	}
}
