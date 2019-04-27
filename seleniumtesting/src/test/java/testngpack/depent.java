package testngpack;

import org.testng.annotations.Test;

public class depent {
	
	@Test
	public void login()
	{
		System.out.println("login");
		int i=9/0;
	}
	@Test(dependsOnMethods="login")
	public void homepge() {
		System.out.println("homepage");
		
	}
	@Test
	public void url()
	{
		System.out.println("url");
	}
}
