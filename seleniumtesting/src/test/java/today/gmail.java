package today;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class gmail {
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
			
		driver.findElement(By.name("identifier")).sendKeys("ajaymito");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.name("password")).sendKeys("suitable");
	
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	driver.findElement(By.xpath("//*[@id=\":33\"]")).click();
	}

}


