package testngpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class multiplebrowser {
WebDriver driver=null;
@Parameters("browsername")
@BeforeTest
public void setup(String browsername){
	System.out.println("browser name"+ browsername);
	if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
	
	else if(browsername.equalsIgnoreCase("ie")) {
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
}
@Test
public void test() {
	driver.get("https://www.youtube.com");
}
@AfterTest
public void teardown() {
	System.out.println("test completed");
	
}
}
