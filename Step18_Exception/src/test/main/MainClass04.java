package test.main;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass04 {
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
			
			//예외를 강제로 발생 시키기
			//throw new SQLException();
			
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌수없음");
		}catch(InputMismatchException ime){
			System.out.println("숫자형태로 입력하세요");
		}catch(Exception e){
			System.out.println("알수없는 오류가 발생했습니다.");
		}finally{
			System.out.println("예외가 발생하던 안하던 실행이 보장됨");
		}

		System.out.println("메인 메소드가 리턴 됩니다.");
	}
}








