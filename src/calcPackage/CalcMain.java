package calcPackage;

import java.util.Scanner;

public class CalcMain 
{
	
	public static float calculator(float a, float b, String operation)
	{
		switch(operation.toUpperCase())
		{
		case "MULTIPLY": return a*b;
		case "ADD": return a+b;
		case "SUBTRACT": return a-b;
		case "DIVIDE":
			if(b!=0)
			return a/b;
			return 0;
		default: return 0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int a = sc.nextInt();
		System.out.println("Please enter your second number");
		int b = sc.nextInt();
		System.out.println("Please enter the operation to perform: ADD, SUBTRACT, MULTIPLY, DIVIDE");
		String operator = sc.next();
		System.out.println("Result: " + calculator(a,b,operator));
		sc.close();
	}

}
