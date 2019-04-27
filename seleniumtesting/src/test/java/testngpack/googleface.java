package testngpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googleface {
	
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.google.com");}
@Test(priority=1)
public void titletest() {
	String d=driver.getTitle();
	System.out.println(d);
	driver.findElement(By.name("q")).sendKeys("heell");
	
}
/*@Test(priority=2)
public void logotest() {
	boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	System.out.println(b);
}
@Test(priority=3)
public void linktest() {
	driver.findElement(By.linkText("YouTube")).isDisplayed();
}
@AfterMethod
	public void close() {
	driver.quit();*/
	
	
}
