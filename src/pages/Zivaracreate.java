package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zivaracreate {
	WebDriver driver;
	
	By account=By.xpath ("//*[@id=\"cart\"]/li[2]/a/svg/g/path");
	By createaccnt=By.xpath("//*[@id=\"customer_login\"]/div/div[4]/button"); 
	By fstname=By.id("first-name");
	By lstname=By.id("last-name");
	By mail=By.id("email");
	By pass=By.id("password");
	By createbutton=By.xpath("//*[@id=\"create_customer\"]/div/div[5]/input");
	 public Zivaracreate(WebDriver driver3)
     {
    	 this.driver=driver3;
     }
	 public void create()
	 {
		 driver.findElement(account).click();
		 
	 }
	 public void createoption()
	 {
		 driver.findElement(createaccnt).click();
	 }
	 public void setvalues(String firstname,String lastname,String email,String password)
	 {
		 driver.findElement(fstname).sendKeys(firstname);
		 driver.findElement(lstname).sendKeys(lastname);
		 driver.findElement(mail).sendKeys(email);
		 driver.findElement(pass).sendKeys(password);
		
	 }
	 public void createbutton()
	 {
		 driver.findElement(createbutton).click();
	 }

}
