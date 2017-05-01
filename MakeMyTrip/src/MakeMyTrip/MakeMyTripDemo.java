package MakeMyTrip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MakeMyTripDemo {
	
	public static void main(String args[]) 
		    throws InterruptedException
		    {
		
		System.setProperty("webdriver.chrome.driver","/home/aj/Downloads/chromedriver (4)"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights?cmp=SEM%7cD%7cDF%7cG%7cBrand%7cB_M_Makemytrip_Search_Exact%7cBrand_Top_5_Exact%7c93065476688&s_kwcid=AL!1631!3!93065476688!e!!g!!make%2520my%2520trip&ef_id=WPCj4wAAAZRl1SfR%3A20170417094107%3As");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		    
		driver.navigate().refresh();
		//driver.findElement(By.id("hp-widget__sfrom")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.id("ui-id-37")).click();
		
		
		//driver.findElement(By.linkText("20")).click();
		
		
		//driver.findElement(By.id("hp-widget__return")).click();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.linkText("22")).click();
		//driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.id("ui-id-459")).click();
		//driver.navigate().refresh();
		
		driver.findElement(By.id("hp-widget__sfrom")).click();
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Keys.ENTER);
		

		

		
		
		    }

}
