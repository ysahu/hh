package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.thoughtworks.selenium.webdriven.commands.GetText;

public class MethodSenKeys 
{
  public static void main(String[] args) 
   {
 
 System.setProperty("webdriver.chrome.driver", "H:\\testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
 WebDriver   driver=new ChromeDriver();
   driver.get("http://www.facebook.com");
 String str=driver.getTitle();
 System.out.println(str);
 driver.findElement(By.id("email")).sendKeys("977056115");
 driver.findElement(By.id("pass")).sendKeys("mokkaa");
 driver.findElement(By.cssSelector("input[type=submit]")).click();
 String s = driver.findElement(By.xpath(".//*[@id='js_0']/div/div/div")).getText();
 System.out.println(s);
 
 

   }
	
}
