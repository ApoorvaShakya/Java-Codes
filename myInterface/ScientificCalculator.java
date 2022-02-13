package myInterface;

public class ScientificCalculator implements ArithmeticOperation
{
	public int addition(int a,int b)
	{
			return a+b;
	}

	public int addtion(int[] args) 
	{
			return 0;
	}

	public int subtraction(int a, int b) 
	{
		return a-b;
	}
	public int subtraction(int[] args)
	{
		return 0;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public int division(int a, int b) 
	{
		return a/b;
	}

}
