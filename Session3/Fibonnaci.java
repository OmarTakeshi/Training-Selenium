package homework3;

import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		printFibonacci(num);
	}

	public static void printFibonacci(int max){
		int num1 = 0, num 2 = 1;
		int num3 = 0;
		for(int i = 0; i < max; i++){}
			num3 = num1 + num2;
		}
		System.out.print(num3+" ");
		num1 = num2;
		num2 = num3;
	}
}