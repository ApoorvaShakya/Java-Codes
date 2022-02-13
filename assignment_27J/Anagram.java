package assignment_27J;

import java.util.Arrays;

public class Anagram
{
	public static void main(String [] args)
	{
		char string1[]= {'b','a','g'};
		char string2[]= {'g','b','a'};
		boolean r=fanagram(string1, string2);
		if(r)
		{
			System.out.println("Strings are anagram of each other");
		}
		else
		{
			System.out.println("Strings are not anagrams of each other");
		}
	}
		
	static boolean fanagram(char[] string1, char[] string2)
	{
		int len1=string1.length;
		int len2=string2.length;
		if(len1!=len2)
		{
			return false;
		}
		Arrays.sort(string1);
		Arrays.sort(string2);
		for(int i=0;i<len1;i++)
		{
			if(string1[i] != string2[i])
			{
				return false;
			}
		}
		return true;
	}
}
