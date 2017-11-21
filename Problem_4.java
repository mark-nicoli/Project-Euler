/*A palindromic number reads the same both ways. The largest palindrome made 
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
   Find the largest palindrome made from the product of two 3-digit numbers.*/

public class problem_4
{
	public static void main(String[]args)
	{
		int product = 1;
		int current;
		int largest = 0;
		for(int i = 999;i>0;i--)
		{
			for(int j = 999;j>0;j--)
			{
				product = i*j;
				if(checkPalindrome(Integer.toString(product)))
				{
					//System.out.println(product);
					current = product;
					if(current > largest)
					{
						largest = current;
					}
				}
			}
		}
		System.out.println("largest palindrome is: "+largest);
	}
	
	public static boolean checkPalindrome(String s)
	{
		String string = "";
		for(int i = s.length();i>0;i--)
		{
			string = string+s.charAt(i-1);
		}
		if (s.equals(string)) return true;
		else return false;
	}
}
