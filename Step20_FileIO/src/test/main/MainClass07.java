package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		//필요한 객체를 담을 변수 만들기
		FileInputStream fis=null;
		FileOutputStream fos=null;

		try{
			//필요한 객체를 생성해서 참조값을 변수에 담기
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			fos=new FileOutputStream("c:/myFolder/myImage2.jpg");
			
			//한번에 읽어들일 byte 의 크기를 고려해서 byte[] 객체 생성
			byte[] buffer=new byte[1024];
			while(true){
				//FileInputStream객체의 read() 메소드 호출하면서
				//메소드의 인자로 byte[] 객체를 전달해서 읽어들인다.
				int readedByte=fis.read(buffer); //1024전달 모두했으면 1024리턴함
				//더이상 읽을 byte 알갱이가 없다면 반복문 탈출
				if(readedByte==-1) break;
				//읽은 만큼 출력하기
				fos.write(buffer, 0, readedByte);
				fos.flush();//방출
			}
			System.out.println("파일을 복사했습니다");// Exception이 발생하지 않았다.
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null)fos.close();
				if(fis!=null)fis.close();
			}catch(Exception e){
				//nullPointException
			}
		}
	}
}
