package com.problems;


		import java.util.Scanner;

		public class Problem3 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a: ");
		        int a = sc.nextInt();

		        int count = (a % 2 == 0) ? a - 1 : a;

		        for (int i = 1; i <= count; i++) {
		            int odd = 2 * i - 1;
		            System.out.print(odd + (i < count ? ", " : ""));
		        }
		        sc.close();
		    }
		}

	