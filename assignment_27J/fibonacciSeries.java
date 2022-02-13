package assignment_27J;

import org.junit.Test;

public class fibonacciSeries
{ 
  @Test
  public void fibonacci()
  {
	  int [] numbers=new int[20];
	  numbers[0]=0;
	  numbers[1]=1;
	  int len=10;
	  for(int i=2;i<len;i++)
	  {
		  numbers[i]=numbers[i-1]+numbers[i-2];
	  }
	  System.out.println("Fibonacci Series ");
	  for(int i=0;i<len;i++)
	  {
		  System.out.print(numbers[i]);
		  System.out.print(" ");
	  }
  }
}

