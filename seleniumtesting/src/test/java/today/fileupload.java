package today;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileupload {

	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.tinyupload.com/");}
		@Test
		public void main() throws IOException {
			driver.findElement(By.xpath("//input[@name='uploaded_file']")).click();
Runtime.getRuntime().exec("C:\\Users\\Ajay\\Desktop\\New folder\\fileupload.exe");
	}

}
