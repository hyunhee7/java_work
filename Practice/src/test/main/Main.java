package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> arr=new ArrayList<>();
		for(int i=0;i<100;i++){
			String txt="";
			if(scan.hasNextLine()){
				txt=scan.nextLine();
			}
			if(txt.length()>100||txt.isEmpty()||txt.endsWith(" ")||txt.startsWith(" ")){
				break;
			}
			arr.add(txt);

		}
	
		for(int i=0;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
	}
}
