package com.linecomparison;
import java.util.Scanner;

public class LineComparisonMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Problem");
		int x1,y1;
		int x2,y2;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("The coordinates are:");
		System.out.print("x1 = ");x1=sc.nextInt();
		System.out.print("y1 = ");y1=sc.nextInt();
		System.out.print("x2 = ");x2=sc.nextInt();
		System.out.print("y2 = ");y2=sc.nextInt();
		
		//UC1
		double length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println("The length of the line is = "+length);
		
		//UC2
		int a1,b1;
		int a2,b2;
		System.out.println("The coordinates of 2nd line are:");
		System.out.print("a1 = ");a1=sc.nextInt();
		System.out.print("b1 = ");b1=sc.nextInt();
		System.out.print("a2 = ");a2=sc.nextInt();
		System.out.print("b2 = ");b2=sc.nextInt();
		double length1 = Math.sqrt(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));
		System.out.println("The length of the 2nd line is = "+length1);
		
		if(length==length1)
			System.out.println("The lines are equal");
		else
			System.out.println("The lines are not equal");
		
		//UC3
		if(length==length1)
			System.out.println("The line1 is equal to line2");
		else if(length>length1)
			System.out.println("The line1 is longer than line2");
		else
			System.out.println("The line 2 is longer then line1");
		
		
		
		
		sc.close();
	}

}
