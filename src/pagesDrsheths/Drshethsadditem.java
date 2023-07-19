package pagesDrsheths;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Drshethsadditem {
	
	WebDriver driver;
	
	By sunscreen=By.xpath("//*[@id=\"products-grid\"]/div[1]/div/div[4]/div/div/div[2]/a/h3");
	By addtocart=By.xpath("//*[@id=\"product-main-form\"]/div[4]/div[1]/div[2]/div[1]/div/div/button");
	
public Drshethsadditem(WebDriver driver)
	
	{
		this.driver=driver;
	}

public void select()
{
	driver.findElement(sunscreen).click();
}
public void addtocart()
{
	driver.findElement(addtocart).click();
	/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();*/
}
	
}
