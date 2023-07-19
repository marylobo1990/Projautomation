import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anotationeg {
	ChromeDriver driver;
		@Before
		public void setUp()
		{
			driver =new ChromeDriver();
			driver.get("https://google.com");
		}
	   @Test
	   public void test1()
	   {
		   String expectedtitle="Google";
		   String actualtitle=driver.getTitle();
		   if(actualtitle.equals(expectedtitle))
		   {
		 	  System.out.println("test passed");
		   }
		   else
		   {
		 	  System.out.println("test failed");
		   }
		   }
	    @After
	    public void teardown()
	    {
	    	driver.close();
	    }
	   }


