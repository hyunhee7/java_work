package test.main;

import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os = System.out;
		OutputStreamWriter osw = new OutputStreamWriter(os);
		try{
			char[] buffer={'가', '나', '다'};
			osw.write("여러개의 문자를 한번에 출력해요~");
			osw.write(buffer);
			osw.flush();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
