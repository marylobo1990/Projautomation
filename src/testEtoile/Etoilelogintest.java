package testEtoile;

import org.testng.annotations.Test;

import pagesEtoile.Etoilelogin;

public class Etoilelogintest extends BaseclasE{
	
	
	@Test
	
	public void testsignin()
	{
		
	Etoilelogin ob1=new Etoilelogin(driver);
		
		ob1.login();
		ob1.setvalues("mariarose1990@gmail.com", "clothesshop123");
		ob1.loginbutton();
	
		
		
	}

}
