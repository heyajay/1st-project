package testngpack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbaisic {
	@BeforeSuite
	public void enter() {
		System.out.println("set up system propoty");
	}
	@BeforeTest
	public void lunchbrowser() {
		System.out.println("lunch");
	}
	@BeforeClass
	public void login() {
		System.out.println("login");
	}
@BeforeMethod
public void enterurl() {
	System.out.println("enter url");
}

@Test
public void googletitle()
{System.out.println("title");
}
@Test
public void searchtext()
{System.out.println("search test");
}
@AfterMethod
public void logout()
{
	System.out.println("logout");}
@AfterTest
public void deletecookies()
{System.out.println("delete all cookies");
}
@AfterClass
public void closebrowser() {
System.out.println("close browser");
}

}
