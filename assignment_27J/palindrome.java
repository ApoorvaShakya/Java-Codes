package assignment_27J;

import org.junit.Test;

public class palindrome
{
	@Test
	public void intpalindrome()
	{
		int number=14241;
		int sum=0;
		int temp=number;
		while(number>0)
		{
			int rem=number%10;
			sum=(sum*10)+rem;
			number=number/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome number:" +temp);
		}
		else
		{
			System.out.println("Not a palindrome number" +temp);
		}
	}
	@Test
	public void StringPalindrome()
	{
		String original="radar";
		String reverse=""; 
		int len=original.length();
		for(int i=(len-1);i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("Palindrome String: " +original);
		}
		else
		{
			System.out.println("Not a palindrome " +original);
		}
	}
}
