package coreConcepts1;

import org.junit.Test;

public class ConditionalStatements
{ 
  public void performadditionif(int a,int b)
  {
	System.out.println("A value: " +a);
	System.out.println("B value: " +b);
	if(a==b)
	{
		int sum=a+b;
		System.out.println("Sum of two numbers is: " +sum);
	}
  }
  @Test
  public void performAddition1_test()
  {
	  performadditionif(44,44);
	  performadditionif(22,11);
  }
  public void performadditionifelse(int a,int b)
  {
	System.out.println("A value: " +a);
	System.out.println("B value: " +b);
	if(a==b)
	{
		int sum=a+b;
		System.out.println("Sum of two numbers is: " +sum);
	}
	else
	{
		int diff=a-b;
		System.out.println("Difference of two numbers is: " +diff);
	}
  } 
  @Test
  public void performAddition_test()
  {
	  performadditionifelse(44,44);
	  performadditionifelse(22,11);
  }
//Write a program to read two input numbers , perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b
 public void performNIfElse(int a, int b)
 {
	 int x;
	 System.out.println("First number is:" +a);
	 System.out.println("Second number is: " +b);
	 if(a==b)
	 {
		 x=a+b;
		 System.out.println("Additon of two numbers is: " +x);
	 }
	 else if(a>b)
	 {
		 x=a-b;
		 System.out.println("Subtraction of two numbers is: " +x);
	 }
	 else
	 {
		 x=a*b;
		 System.out.println("Multiplication of two numbers is:" +x);
	 }
 }
 @Test
 public void performNIfElse_test()
 {
	 performNIfElse(22,22);
	 performNIfElse(2,22);
	 performNIfElse(22,20);
 }
 
//Write a program to read two input numbers and perform the below task if and only if both inputs are above 10	
	//Task : perform addition if they are equal ,do subtraction if a>b , do multiplication if a<b
 public void logicalOperators(int a, int b)
 {   int x;
	 System.out.println("First number is: " +a);
	 System.out.println("Second number is: " +b);
	 if((a>10) && (b>10))
	 {
		 if(a==b)
		 {
			 x=a+b;
			 System.out.println("The sum of two numbers is: " +x);
		 }
		 else if(a>b)
		 {
			 x=a-b;
			 System.out.println("The difference of two numbers is: " +x);
		 }
		 else
		 {
			 x=a*b;
			 System.out.println("Multiplication of two numbers is: " +x);
		 }
	 }
	 else
	 {
		 System.out.println("Either one of them is less than 10 or both are less than 10");
	 }
 }
 @Test
 public void logicalOperators_test()
 {
	 logicalOperators(22,22);
	 logicalOperators(11,22);
	 logicalOperators(22,12);
	 logicalOperators(22,1);
	 logicalOperators(1,22);
 }
 
 //SWITCH 
 public void switchuse(char grade)
 {
	 switch(grade)
	 {
	   case 'A':
	   {
		   System.out.println("The child passed with distinction, grade " +grade);
		   break;
		}
	   case 'B':
	   {
		   System.out.println("The child passed with First Class, grade " +grade);
		   break;
	   }
	   case 'C':
	   {
		   System.out.println("The child passes in second class, grade " +grade);
		   break;
	   }
	   case 'D':
	   {
		   System.out.println("The child passed with third class, grade " +grade);
		   break;
	   }
	   case 'E':
	   {
		   System.out.println("The child passed in forth class, grade " +grade);
		   break;
	   }
	   case 'F':
	   {
		   System.out.println("The child failed, grade " +grade);
		   break;
	   }
	   default:
	   {
		   System.out.println("Grade is not valid, grade " +grade);
		   break;
	   }
	}
 }
 @Test
 public void switchUse_Test()
 {
	 switchuse('A');
	 switchuse('B');
	 switchuse('D');
	 switchuse('E');
	 switchuse('F');
	 switchuse('C');
	 switchuse('I');
 }
 
}





