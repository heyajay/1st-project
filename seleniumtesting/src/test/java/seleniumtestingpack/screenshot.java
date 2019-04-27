package seleniumtestingpack;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	static WebDriver driver=null;
@Test
public  void takescreenshot() throws IOException {
	WebDriverManager.firefoxdriver().setup();
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
       ss("fb");}
        public static void ss(String photo) throws IOException {
    TakesScreenshot  tr  =(TakesScreenshot)driver;
   

 File tg   =tr.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(tg, new File("D:\\new eclipse\\seleniumtesting\\src\\test\\java\\seleniumtestingpack//"+photo+".png"));
	
System.out.println("done");}

}