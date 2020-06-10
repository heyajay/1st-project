package workingwithexcel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dataprovider {
	WebDriver driver;
	@BeforeMethod
	public void mail() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.google.com");
		System.out.println("git");
	}
	@Test
	public void email() {
		driver.findElement(By.name("identifier")).sendKeys("ajaymito");
	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		driver.findElement(By.name("password")) .                sendKeys("sundhira");
	
	driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	}

}
