package mit1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		char ch;
		String str="";
		String nStr="";
		Scanner Sn= new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=Sn.nextLine();
		for(int i=0; i<str.length();i++) {
			 ch=str.charAt(i);
			 nStr=ch+nStr;
		}
		System.out.println("The Reversed String is: " + nStr);
	} 
       
}
