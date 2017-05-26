package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  MainClass04 를 참고해서
 *  Scanner 객체를 이용해서 문자열 1줄을 입력받고
 *  입력받은 내용을
 *  c:/myFolder/quiz01.txt 파일에 기록해 보세요.
 */
public class Quiz01 {
	public static void main(String[] args) {
		
		String path="c:/myFolder/quiz01.txt";
		File file = new File(path);
		
		Scanner scan=new Scanner(System.in);
		
		try {
			//파일에 문자열을 기록하기 위한 객체
			FileWriter fw=new FileWriter(file);
			//문자열 한줄 읽어들이기
			System.out.println("기록할 문자를 입력하세요: ");
			String wt=scan.nextLine();
			//읽은 내용을 파일에 기록하기
			fw.write(wt);
			fw.close();
			System.out.println("입력완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
