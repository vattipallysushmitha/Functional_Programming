package com.bridzelab.functionalProgramming;
import java.util.Scanner;   // import Scanner
public class FunctionalProgramming {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);   // Make Scanner Obj
        System.out.println("Enter the co-ordinates x,y: ");
        int x = scanner.nextInt();  // Input Int
        int y = scanner.nextInt();

        double distance = Math.sqrt(x*x+y*y);  //Mathematical Formula
        System.out.println("The Euclidean Distance of the point from origin is = "+ distance);


    }

}