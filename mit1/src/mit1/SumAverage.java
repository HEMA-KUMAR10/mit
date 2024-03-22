package mit1;
import java.lang.ArrayIndexOutOfBoundsException;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		int m,i,j;
		int[] n = new int[10] ;
		float sum=0, average=0;
		Scanner Sn =new Scanner(System.in);
		System.out.println("Enter the no.of integers: ");
		m = Sn.nextInt();
		for (i=0;i<m;i++) { 
			System.out.println("Enter the integer" + (i+1) + " : ");
			n[i] = Sn.nextInt();
		}
		for(j=0;j<m;j++) {
			 sum=sum+n[j];
		}
		average = sum/m;
		System.out.println("The Sum is: " + sum);
		System.out.println("The Average is: "+average);
	}
	

}
