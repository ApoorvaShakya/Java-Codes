package coreConcepts1;

import org.junit.Test;

public class AssignmentConditional
{  //find a perticular student 
	public boolean findStudent(int count,int rollNum) 
	{
		boolean result = false;
		for(int r=1;r<=count;r++) 
		{
			if(r==rollNum) 
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
//Write a program to read the range and rollNumber as inputs to find in the given range/list
	
}
