import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver =new ChromeDriver();
		driver.get("https://google.com");
	}
	@Test
	public void pageTest()
	{
		String s=driver.getPageSource();
		if(s.contains("Gmail"))
		    {
			  System.out.println("test passed");
		    }
		   else
		   {
		 	  System.out.println("test failed");
		   }
		   
		}
	 public void teardown()
	    {
	    	driver.close();
	    }
	}



