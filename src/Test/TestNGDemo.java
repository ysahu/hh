package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "H:\\testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver   driver=new ChromeDriver();
		   driver.get("http://www.facebook.com");
		   String pagetitle = driver.getTitle();
		   


	}

}
