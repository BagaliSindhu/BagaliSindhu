package com.problems;

    import java.util.Scanner;

		class Calculator {
		    private double a, b;

		    public Calculator(double a, double b) {
		        this.a = a;
		        this.b = b;
		    }

		    public double compute(String operation) {
		        switch (operation.toLowerCase()) {
		            case "add":
		            case "+":
		                return a + b;
		            case "subtract":
		            case "-":
		                return a - b;
		            case "multiply":
		            case "*":
		                return a * b;
		            case "divide":
		            case "/":
		                if (b == 0) {
		                    throw new ArithmeticException("Division by zero not allowed");
		                }
		                return a / b;
		            default:
		                throw new IllegalArgumentException("Invalid operation: " + operation);
		        }
		    }
		}

		public class Problem1 {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        double a = sc.nextDouble();

		        System.out.print("Enter second number: ");
		        double b = sc.nextDouble();

		        System.out.print("Enter operation (add, subtract, multiply, divide): ");
		        String op = sc.next();

		        Calculator calc = new Calculator(a, b);
		        try {
		            double result = calc.compute(op);
		            System.out.println("Result = " + result);
		        } catch (Exception e) {
		            System.out.println("Error: " + e.getMessage());
		        }

		        sc.close();
		    }
		}

	
