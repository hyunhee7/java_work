package test.main;

import java.util.Scanner;

/*
 *  익명의 클래스를 이용한 
 *  간략하게 Thread 만들기
 */
public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		Thread t1=new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("새로운 작업 단위 시작");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("새로운 작업 단위 종료");
			}
		});
		t1.start(); //새로운 스레드 시작 시키기
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				System.out.println("새로운 작업 단위 시작");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("새로운 작업 단위 종료");
			}
			
		}).start();
		
		
		System.out.println("메인 메소드가 종료 됩니다.");
	}
}
