package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass01_1 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		Scanner scan=new Scanner(System.in);
		try{
			System.out.print("나눌수(젯수) 입력:");
			int num1=scan.nextInt();
			
			System.out.print("나누어 지는수(피젯수) 입력:");
			int num2=scan.nextInt();
			
			//num2 를 num1 으로 나눈 몫을 변수에 저장
			int mog=num2/num1;
			//num2 를 num1 으로 나눈 나머지를 변수에 저장
			int na=num2%num1;
			
			System.out.println(num2+" 를 "+num1+" 으로 나눈 결과");
			System.out.println("몫:"+mog+" 나머지:"+na);	
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌수는 없어요");
		}catch(InputMismatchException ime){
			//예외 정보 출력해보기
			ime.printStackTrace();
		}
					


		System.out.println("메인 메소드가 리턴 됩니다.");
	}
}








