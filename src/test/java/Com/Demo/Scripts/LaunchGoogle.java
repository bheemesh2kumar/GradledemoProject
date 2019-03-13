package Com.Demo.Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {
	
	
	@Test
	public void lunchgoogle()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Driverservers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String pagetitle=driver.getTitle();
		System.out.println("the page title is " +pagetitle );
		driver.quit();
		
	}
	

}
