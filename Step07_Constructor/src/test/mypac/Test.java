package test.mypac;

public class Test {
	
	public String msg;
	//static멤버메소드에서는 static멤버필드만 참조가 가능
	public static int age;
	public static double weight;
	public static String name;
	
	public static void showInfo(){
		System.out.println(Test.age);
		System.out.println(weight);
		System.out.println(name);
		System.out.println(new Test().msg);
		
		//static 멤버 메소드안에서는 static 멤버들만 접근 가능하다
		//System.out.println(this.msg);
	}
}

