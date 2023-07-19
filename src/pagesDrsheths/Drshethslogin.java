package pagesDrsheths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drshethslogin {
	WebDriver driver;
	
	By loginicon=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By email=By.id("CustomerEmail");
    By loginpass=By.id("CustomerPassword");
    By login=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[2]/div/input");
    
    public Drshethslogin(WebDriver driver2)
    {
   	 this.driver=driver2;
    }
    public void login()
    {
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
