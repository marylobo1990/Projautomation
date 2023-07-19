package pagesEtoile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Etoileitem {

	
WebDriver driver;
	By Newin=By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[1]/a");
	By item=By.xpath("//*[@id=\"shopify-section-template--16903877820630__main\"]/section/div[2]/div[2]/div[2]/div[1]/div/div[1]/div/div/div/h2/a");
	By addtocart=By.xpath("//*[@id=\"product_form_8106454974678\"]/div[4]/button/span");
	By viewcart=By.xpath("//*[@id=\"section-header\"]/div/div[3]/a[4]");
public Etoileitem(WebDriver driver)
	
	{
		this.driver=driver;
	}

public void select()
{
	driver.findElement(Newin).click();
	driver.findElement(item).click();
}
public void addtocart()
{
	driver.findElement(addtocart).click();
	driver.findElement(viewcart).click();
	/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();*/
}
}
