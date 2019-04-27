package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class abc {
WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.zoopla.co.uk/");}
		@Test
		public void go() throws InterruptedException {
			
		driver.findElement(By.xpath("//input[@id='search-input-location']")).sendKeys("london");
	driver.findElement(By.xpath("//button[text()='Search']")).click();
	  List<WebElement> list =driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
	  char c=list.get(0).getText().charAt(0);
	  System.out.println(c);
	  ArrayList<Integer> al=new ArrayList<Integer>();
	  for(WebElement l:list)
	  {
		  al.add(Integer.parseInt(l.getText().replaceAll("[^0-9]", "")));
	  }
	  Collections.sort(al, Collections.reverseOrder());
	  
	  for(int r:al)
	  {
		  System.out.println(c+""+r);
	  }
	  driver.findElement(By.xpath("(//a[@class='listing-results-price text-price'])[8]")).click();
	  String ownerno= driver.findElement(By.xpath("//a[@data-track-label=\\\"Agent phone number 1\\\"]/text()")).getText();
	  String ownername=driver.findElement(By.xpath("(//div[@class='ui-agent__text']//h4[@class='ui-agent__name'])[1]")).getText();
	  driver.findElement(By.xpath("(//div[@class='ui-agent__text']//h4[@class='ui-agent__name'])[1]")).click();
	  String ownername1=driver.findElement(By.xpath("//h1[@class='bottom-half']/b[1]")).getText();
	  String ownerno1= driver.findElement(By.xpath("//a[@data-track-label=\"Agent phone number 1\"]/text()")).getText();
System.out.println("ownerno "+ownerno );
System.out.println("ownername "+ownername);
System.out.println("ownername1 "+ownername1);
System.out.println("ownerno1 "+ownerno1);
if(ownername.equals(ownername1)) {System.out.println("name passed");}
else {System.out.println("name fail");}

	if(ownerno.equals(ownerno1)) {System.out.println("name passed");}
	else System.out.println("no fail");
	Thread.sleep(10000);
	
	// int count =list.size();
	  
	  /*Collections.sort(list,list.reverseOrder());
	  
	  System.out.println("After sorting: " + list);
	   
	  Collections.reverse(list);
	   
	  System.out.println("After reversing: " + list);*/
	  
	  
	  
	  
	  //Collections.sort(list, c);rt(list);
	 // for (int i = 0; i < count; i++) {
			//System.out.println(list.get(i).getText());
		}
			
		}
	
	//driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
	//driver.findElement(By.xpath("//*[@id=\":33\"]")).click();
	

