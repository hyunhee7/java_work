package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  MainClass04 를 참고해서
 *  Scanner 객체를 이용해서 문자열 5줄을 입력받고
 *  입력받은 내용을
 *  c:/myFolder/quiz01.txt 파일에 기록해 보세요.
 */
public class Quiz02 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);		
		String path="c:/myFolder/quiz02.txt";
		File file = new File(path);
		
		try {
			//파일에 문자열을 기록하기 위한 객체
			FileWriter fw=new FileWriter(file);
			StringBuilder sb=new StringBuilder();
			
			for(int i=0;i<5;i++){
				System.out.println("입력해주세요: ");
				String line=scan.nextLine();
				sb.append(line);
				sb.append("\r\n");
			}
			fw.write(sb.toString());
			fw.close();
			System.out.println("입력완료");
			
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			while(true){
				//한줄씩 읽어들이기
				String line=br.readLine();
				//더이상 읽을 문자열이 없다면 break 예약어를 이용해서 빠져 나오기
				if(line==null) break;
					System.out.println(line);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
