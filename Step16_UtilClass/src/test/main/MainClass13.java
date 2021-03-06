package test.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
 *  1. Scanner 객체를 이용해서 문자열을 5번 입력 받아서
 *  입력 받은 문자열을 ArrayList 객체에 저장하고
 *  
 *  2. 저장된 문자열을 순서대로 콘솔창에 출력 해 보세요
 *  
 *  1. Scanner 객체를 이용해서 문자열을 5번 입력 받아서
 *  입력 받은 문자열을 HashSet 객체에 저장하고
 *  
 *  2. 저장된 문자열을 모두 콘솔창에 출력해 보세요.
 */
public class MainClass13 {
	public static void main(String[] args) {
		ArrayList<String> arr1=new ArrayList<>();
		for(int i=0;i<5;i++){
			Scanner scan=new Scanner(System.in);
			System.out.print("입력할 문자: ");
			String word=scan.nextLine();
			
			arr1.add(word);
		}
		System.out.println(arr1);
				
		Set<String> set=new HashSet<>();
		for(int i=0;i<5;i++){
			Scanner scan=new Scanner(System.in);
			System.out.print("입력할 문자: ");
			String word=scan.nextLine();
			
			set.add(word);
		}
		System.out.println(set);
		
		Random ran=new Random();
		int idx=ran.nextInt(5)+1;
		String result=arr1.get(idx);
		System.out.println(result);
	}
}
