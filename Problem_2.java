//even fibonacci numbers

import java.util.Scanner;

public class Problem_2 {

	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount of digits: ");
		int number = scan.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= number; i++) 
		{
			System.out.println(fibonacciRecusion(i) + " ");
			if(fibonacciRecusion(i)%2==0)
			{
				sum += fibonacciRecusion(i); 
			}
		}
		System.out.println(sum);
		scan.close();

	}
 
	public static int fibonacciRecusion(int number) 
	{
		if (number == 1 || number == 2) 
		{
			return 1;
		}
 
		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); 
	}
 
}
