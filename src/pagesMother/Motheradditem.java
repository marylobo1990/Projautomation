package pagesMother;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Motheradditem {
	
WebDriver driver;
	
	By bitebalm=By.xpath("//*[@id=\"title-template--16181722513570__featured-collection-0-5872044474530\"]");
	By addtocart=By.xpath("//*[@id=\"product-form-template--16181723267234__main\"]/div/button");
	
public Motheradditem(WebDriver driver)
	
	{
		this.driver=driver;
	}

public void select()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.switchTo().frame("webklipper.publisher-widget-container-survey-frame");
    driver.findElement(By.id("survey-close-div")).click();
    driver.switchTo().defaultContent();
	
	driver.findElement(bitebalm).click();
}
public void addtocart()
{
	driver.findElement(addtocart).click();
	/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();*/
}

}
