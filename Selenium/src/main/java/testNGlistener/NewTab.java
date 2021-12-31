package testNGlistener;




import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab {

	WebDriver driver;
	
	@Test(priority=1)
	public  void main() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.topsmarkets.com/");
			}
	@Test(priority=2)
	public void getScreenShot() throws Exception {
		
		File file = new File("c:/hoque/atest1.png");
		File scrn = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrn, file);
		
	}
	
	
	
	@Test(priority=3)
		public void  openNewTab() {
		((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank');");
		//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+ "t");
	   //	Keys.chord(Keys.CONTROL,Keys.ENTER);
	}
	
	@Test(priority=4)
	public void clickLogin() {
		driver.findElement(By.xpath("")).click();
	}
	
		@Test(priority=5)
		public void tearDown() {
         driver.quit();
	}

}
