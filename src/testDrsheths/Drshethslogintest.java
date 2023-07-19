package testDrsheths;
import org.testng.annotations.Test;

import pagesDrsheths.Drshethslogin;


public class Drshethslogintest extends Baseclas{
	
		
		
	@Test
		
		public void testsignin()
		{
			
		Drshethslogin ob1=new Drshethslogin(driver);
			
			ob1.login();
			ob1.setvalues("mariarose1990@gmail.com", "shopforjewellery123");
			ob1.loginbutton();
		
			
			
		}

}
