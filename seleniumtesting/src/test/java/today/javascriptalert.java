package today;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascriptalert {
WebDriver driver;
@BeforeTest()
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");}
		@Test
		public void main() throws InterruptedException {
driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
 Alert alt=driver.switchTo().alert();
        System.out.println(alt.getText());
        // Thread.sleep(3000);
        System.out.println("yes");
        alt.sendKeys("Yes");
        alt.accept();
        System.out.println("git");
        /*driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
        Alert alt1=driver.switchTo().alert();
System.out.println("no");
         alt1.sendKeys("no");
         driver.findElement(By.xpath("//button[text()='Prompt Pop up']")).click();
         Alert alt2=driver.switchTo().alert();
alt2.accept();*/
	}
	}

