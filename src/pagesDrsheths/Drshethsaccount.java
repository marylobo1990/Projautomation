package pagesDrsheths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drshethsaccount {
	
	WebDriver driver;
	By createicon=By.xpath("//*[@id=\"shopify-section-header-toplink-menu\"]/ul/li/a");
	By create=By.xpath("//*[@id=\"customer_login\"]/div[2]/div[1]/button");
	By fstname=By.name("customer[first_name]");
	By lstname=By.name("customer[last_name]");
	By mail=By.id("Email");
	By passwd=By.id("CreatePassword");
	By submit=By.xpath("//*[@id=\"create_customer\"]/div/div/div[2]/ul/li[3]/div/input");
	
	public Drshethsaccount(WebDriver driver2)
     {
    	 this.driver=driver2;
     }
	public void create()
	{
		
	  driver.findElement(createicon).click();
	  
	}
	public void createaccnt()
	{
		driver.findElement(create).click();
	}
	
	public void setvalues(String firstname,String lastname,String email,String password)
	{
		driver.findElement(fstname).sendKeys(firstname);
		driver.findElement(lstname).sendKeys(lastname);
		driver.findElement(mail).sendKeys(email);
		driver.findElement(passwd).sendKeys(password);
	}
	public void submit()
	{
		driver.findElement(submit).click();

	}


}
