package pagesMother;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Motherlogin {
	
WebDriver driver;
	
	By loginicon=By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[2]");
	
	
	By email=By.id("CustomerEmail");
    By loginpass=By.id("CustomerPassword");
    By login=By.xpath("//*[@id=\"customer_login\"]/button");
    
    public Motherlogin(WebDriver driver2)
    {
   	 this.driver=driver2;
    }
    public void login()
    {
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.switchTo().frame("webklipper.publisher-widget-container-survey-frame");
     driver.findElement(By.id("survey-close-div")).click();
     driver.switchTo().defaultContent();
     
   //  JavascriptExecutor js=(JavascriptExecutor) driver);
    // js.executeScript("window.scrollBy(0,450"),"");
     
   	 driver.findElement(loginicon).click();
   	 
    }
     
    public void setvalues(String emailid,String loginpassword)
    {
   	 driver.findElement(email).sendKeys(emailid);
   	 driver.findElement(loginpass).sendKeys(loginpassword);
   	 
    }
    public void loginbutton()
    {
   	 driver.findElement(login).click();
   	 //driver.navigate().back();
   	 //driver.close();
    }


}
