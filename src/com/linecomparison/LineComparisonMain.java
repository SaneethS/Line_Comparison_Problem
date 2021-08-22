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
		
		sc.close();
	}

}
