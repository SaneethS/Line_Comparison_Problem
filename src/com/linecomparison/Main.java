package com.linecomparison;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison problem");
		LineComparisonMain line = new LineComparisonMain();
		
		System.out.println("Length of line");
		line.length();
		System.out.println("");
		
		System.out.println("Equality of Lines");
		line.equality();
		System.out.println("");
		
		System.out.println("Comparison between Lines");
		line.comparison();
	}

}
