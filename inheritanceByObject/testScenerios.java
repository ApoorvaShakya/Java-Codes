package inheritanceByObject;

import org.junit.Test;

public class testScenerios extends testCases
{
	@Test
	public void smokeSuite()
	{
		System.out.println("Test Suite : SMOKE");
		composeAndSendAnEmail();
		forwardAnEmail();
	}
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		forwardAnEmail();
		replyToAnEmail();
		deleteAnEmail();
	}
}
