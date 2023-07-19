package testMother;

import org.testng.annotations.Test;

import pagesMother.Motherlogin;

public class Motherlogintest extends Baseclasm{
	
	
	@Test
	
	public void testsignin()
	{
		
	Motherlogin ob5=new Motherlogin(driver);
	ob5.login();
	ob5.setvalues("mariarose1995@gmail.com", "motherbaby123");
	ob5.loginbutton();
	
	
		
		
	}

}
