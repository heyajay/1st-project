package testngpack;

import org.testng.annotations.Test;

public class tentimesrun {
	@Test(invocationCount=10)
	public void url()
	{
		System.out.println("url");
	}

}
