package seleniumtestingpack;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scroll {
	WebDriver driver;
	@Test
	public void scroll1() {
		WebDriverManager.chromedriver().setup();
		
		   driver=new ChromeDriver();
		   driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		JavascriptExecutor ts=(JavascriptExecutor)driver;
		ts.executeScript("scroll(0,800)");
		ts.executeScript("scroll(0,-400)");
	}

}
