package mit1;

import java.util.Scanner;

import java.math.*;

public class Distance {

	public static void main(String[] args) {
		float x1,x2,y1,y2,distance;
	    Scanner Sn = new Scanner(System.in);
		System.out.println("Enter the x-coordinate of Point1: ");
		x1 = Sn.nextFloat();
		System.out.println("Enter the y-coordinate of Point1: ");
		y1 = Sn.nextFloat();
		System.out.println("Enter the x-coordinate of Point2: ");
		x2 = Sn.nextFloat();
		System.out.println("Enter the y-coordinate of Point2: ");
		y2 = Sn.nextFloat();
		distance = sqrt(pow((x2-x1),2.0f)+ pow((y2-y1),2.0f));
		

	}

}
