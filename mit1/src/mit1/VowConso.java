package mit1;

import java.util.Scanner;

public class VowConso {

	public static void main(String[] args) {
		String str="";
		int vowels = 0, consonants = 0;
		char ch;
		Scanner Sn = new Scanner (System.in);
		System.out.println("Enter the string: ");
		str=Sn.nextLine();
		str=str.toLowerCase();
		for (int i = 0;i<str.length();++i) {
			 ch = str.charAt(i);
			 if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				 ++vowels;
			 }
			 else if( ch>='a' && ch<='z') {
				  ++consonants;
			 }
		}
		System.out.println("The number of vowels in the string: ");
		System.out.print(vowels);
		System.out.println("\nThe number of consonants in the string: ");
		System.out.print(consonants);
	}

}
