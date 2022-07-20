package com.bridzelab.functionalProgramming;
import java.util.Scanner;   // import Scanner
public class FunctionalProgramming {

	public static void main(String[] args) {
		  int[] arr=UserInput();  //TAke input choice
          int t = arr[0]; //Array initializer
          int v = arr[1];

          while(t>50 || v>120 || v<3){

              arr=UserInput();
              t = arr[0];
              v = arr[1];
          }
          double w = 35.74 + 0.6215*t + (0.4275*t+35.75)*Math.pow(v,0.16);
          System.out.println("The WindChill is : " + w);
      }
      public static int[] UserInput(){

          Scanner scanner = new Scanner(System.in);  //Make Scanner obj
          System.out.println("Enter temperature in F and wind speed in mph : ");
          int t = scanner.nextInt();  //Input Int
          int v = scanner.nextInt();
          int[] arr = new int[2];   // array declaration and initialization
          arr[0]=t;
          arr[1]=v;
          return arr;
      }

}

