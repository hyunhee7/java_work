package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  MainClass04 를 참고해서
 *  Scanner 객체를 이용해서 문자열 여러줄을 입력받고
 *  단, "q" 혹은 "Q" 를 입력할 때 까지 문자열만 저장하세요 
 *  c:/myFolder/quiz03.txt 파일에 기록해 보세요.
 */
public class Quiz03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);		
		String path="c:/myFolder/quiz03.txt";
		File file = new File(path);
		
		try {
			//파일에 문자열을 기록하기 위한 객체
			FileWriter fw=new FileWriter(file);
			StringBuilder sb=new StringBuilder();
			while(true){
				System.out.println("입력하세요: ");
				String line=scan.nextLine();
				if(line.equals("q")||line.equals("Q")) {
					fw.write(sb.toString());
					break;
				}
				sb.append(line);
				sb.append("\r\n");
			}
			fw.close();
			System.out.println("입력 완료");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
