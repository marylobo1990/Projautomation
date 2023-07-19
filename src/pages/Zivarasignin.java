package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zivarasignin {
	
	
	
      WebDriver driver;
     
     By login=By.xpath("//*[@id=\"cart\"]/li[2]");
     //By createaccnt=By.xpath("//*[@id=\"customer_login\"]/div/div[4]/button");
     
     By email=By.id("customer-email");
     By loginpass=By.id("customer-password");
     By signin=By.xpath("//*[@id=\"customer_login\"]/div/div[4]/input");
   
     public Zivarasignin(WebDriver driver2)
     {
    	 this.driver=driver2;
     }
     public void login()
     {
    	 driver.findElement(login).click();
    	 
     }
      
     public void setvalues(String emailid,String loginpassword)
     {
    	 driver.findElement(email).sendKeys(emailid);
    	 driver.findElement(loginpass).sendKeys(loginpassword);
    	 
     }
     public void signin()
     {
    	 driver.findElement(signin).click();
    	 //driver.navigate().back();
    	 //driver.close();
     }

    

}
