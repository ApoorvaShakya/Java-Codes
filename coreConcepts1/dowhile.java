package coreConcepts1;

import org.junit.Test;

public class dowhile
{
	public boolean findStudent(int count,int rollNum) 
	{
		boolean result = false;
		for(int r=1;r<=count;r++) 
		{
			if(r==rollNum) //1 2 3 4 22==22 -> false
			{
				
				result = true;
				break;
			}			
		}
		return result;
	}
	@Test
	public void findStudent_Test()
	{
		boolean output = findStudent(50,32);
		if(output)
		{
			System.out.println("Student Found");
		}
		else
		{
			System.out.println("Student Not Found");
		}
	}

	// do { task } while(condition);
	public void printEvenNumbersOfUserChoice(int howMany)
	{
		int start = 1;
		int count = 0;
		do
		{
			if((start % 2) == 0)
			{
				System.out.println("Even Number :" + start);
				count++;
			}
			start++;
		} while(count<howMany);
		System.out.println("Ending number :" + start);
	}
	@Test
	public void printEvenNumbersOfUserChoice_Test()
	{
		printEvenNumbersOfUserChoice(50);
	}
}
