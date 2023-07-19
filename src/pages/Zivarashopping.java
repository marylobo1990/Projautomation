package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zivarashopping {
	WebDriver driver;
	
	By category=By.xpath("//*[@id=\"shopify-section-header\"]/div/div[1]/nav/ul/li[4]/a/span[1]");
	
	By Kempjewellery=By.xpath("//*[@id=\"shopify-section-header\"]/div/div[1]/nav/ul/li[4]/ul/li[2]/a");
	By select=By.xpath("//*[@id=\"product-listing-8066871197916\"]/div[2]/a/h2");
	By addtocart=By.id("addToCart");
	
	
	public Zivarashopping(WebDriver driver)
	
	{
		this.driver=driver;
	}
	public void category()
	{
		driver.findElement(category).click();
	}
	public void kempjewellery()
	{
		
		driver.findElement(Kempjewellery).click();
	}

	public void select()
	{
		driver.findElement(select).click();
	}
	public void addtocart()
	{
		driver.findElement(addtocart).click();
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();*/
	}
	
	

}
