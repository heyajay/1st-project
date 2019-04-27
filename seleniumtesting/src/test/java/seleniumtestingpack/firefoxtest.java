package seleniumtestingpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class firefoxtest {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
   driver=new ChromeDriver();
   driver.manage().window().maximize();
driver.get("http://www.corelangs.com/html/default.html");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

driver.findElement(By.xpath("//*[@id=\"rcol\"]/span[3]/span/span")).click();
//driver.findElement(By.id("")).click();
	
 driver.quit();
}}
