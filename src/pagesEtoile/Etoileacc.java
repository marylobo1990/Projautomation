package pagesEtoile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Etoileacc {
	
	WebDriver driver;
	By createicon=By.xpath("//*[@id=\"section-header\"]/div/div[3]/a[2]");
	By create=By.xpath("//*[@id=\"customer_login\"]/div[3]/a");
	By fstname=By.name("customer[first_name]");
	By lstname=By.name("customer[last_name]");
	By mail=By.name("customer[email]");
	By passwd=By.name("customer[password]");
	By submit=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public Etoileacc(WebDriver driver2)
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
