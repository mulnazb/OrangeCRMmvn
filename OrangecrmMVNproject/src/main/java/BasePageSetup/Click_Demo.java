package BasePageSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Click_Demo  extends Driver_Setup{

   public WebDriver driver;
	
   public Click_Demo (WebDriver driver) {
		this.driver = driver;
	}
	
	
	By clickonDemo = By.xpath("//a[@class='btn-orange contact-ohrm '] ");
	By email = By.id("myText");
	
	public void getClick() {
		
driver.findElement(clickonDemo).click();
	
	}
	
	public void eMail() {
		driver.findElement(email).sendKeys("abcd@gmail.com");
	}
	
}
