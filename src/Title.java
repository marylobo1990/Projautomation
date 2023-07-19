import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String expectedtitle="Google";
  ChromeDriver driver=new ChromeDriver();
  
  driver.get("https://www.google.com");
  String actualtitle=driver.getTitle();
  if(actualtitle.equals(expectedtitle))
  {
	  System.out.println("test passed");
  }
  else
  {
	  System.out.println("test failed");
  }
  driver.quit();//to automatically close the browser after launch 
  driver.close();//to close the current window if multiple tabs are opened
	}

}
