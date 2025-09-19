package com.problems;


		import java.util.Scanner;

		public class Problem2 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a: ");
		        int a = sc.nextInt();

		        for (int i = 1; i <= a; i++) {
		            int odd = 2 * i - 1;
		            System.out.print(odd + (i < a ? ", " : ""));
		        }
		        sc.close();
		    }
		}

	
