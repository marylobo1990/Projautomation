package pagesEtoile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Etoilelogin {
	
WebDriver driver;
	
	By loginicon=By.xpath("//*[@id=\"section-header\"]/div/div[3]/a[2]");
	By email=By.name("customer[email]");
    By loginpass=By.name("customer[password]");
    By login=By.xpath("//*[@id=\"customer_login\"]/button");
    
    public Etoilelogin(WebDriver driver2)
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
