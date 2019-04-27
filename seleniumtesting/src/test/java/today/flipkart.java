package today;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart {

WebDriver driver;
@BeforeTest
public void mail() {
	WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");}
	@Test
	public void fgh() {
       // driver.findElement(By.partialLinkText("New to Flipkart")).click();					
	List<WebElement> r=	driver.findElements(By.tagName("a"));
		//driver.findElement(By.partialLinkText("New to Flipkart").click();
	//driver.findElement(By.linkText("Explore")).click();	
		//driver.findElements(By.tagName("a"));
	System.out.println(r.size());
	for(int i = 0; i < r.size(); i++){
		System.out.println(r.get(i).getText());
	//for(WebElement item:r){
	       // System.out.println(item);

}}}