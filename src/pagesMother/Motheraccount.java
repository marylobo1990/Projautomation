package pagesMother;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Motheraccount {
	
	WebDriver driver;
	By createicon=By.xpath("//*[@id=\"shopify-section-header\"]/sticky-header/header/div/a[2]");
	
	By register=By.xpath("//*[@id=\"customer_login\"]/a[2]");
	By fstname=By.name("customer[first_name]");
	By lstname=By.name("customer[last_name]");
	By dob=By.name("customer[note][dob]");
	By mail=By.id("RegisterForm-email");
	By passwd=By.id("RegisterForm-password");
	By chckbx=By.id("tc-check");
	By submit=By.xpath("//*[@id=\"create_customer\"]/button");
	
	public Motheraccount(WebDriver driver2)
     {
    	 this.driver=driver2;
     }
	public void create()
	{
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	     driver.switchTo().frame("webklipper.publisher-widget-container-survey-frame");
	     driver.findElement(By.id("survey-close-div")).click();
	     driver.switchTo().defaultContent();
		
	      driver.findElement(createicon).click();
	  
	}
	public void register()
	{
		driver.findElement(register).click();
	}
	
	public void setvalues(String firstname,String lastname,String DOB,String email,String password)
	{
		driver.findElement(fstname).sendKeys(firstname);
		driver.findElement(lstname).sendKeys(lastname);
		driver.findElement(dob).sendKeys(DOB);
		driver.findElement(mail).sendKeys(email);
		driver.findElement(passwd).sendKeys(password);
	}
	public void submit()
	{
		driver.findElement(chckbx).click();
		
		driver.findElement(submit).click();

	}



}
