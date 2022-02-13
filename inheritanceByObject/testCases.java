package inheritanceByObject;
import org.junit.Test;

public class testCases extends reusableComponents
{
	@Test
	public  void composeAndSendAnEmail() //Java function
	{
		System.out.println("Test Case : ComposeAndSendAnEmail ");
		//launch 10 lines , login 15 lines , compose , send , logout , close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void replyToAnEmail() //Java function
	{
		System.out.println("Test Case : Reply to An Email");
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void forwardAnEmail()
	{
		System.out.println("Test Case : Forward An Email");
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public  void deleteAnEmail()
	{
		System.out.println("Test Case : Delete An Email");
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}

}
