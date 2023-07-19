package test;

import org.testng.annotations.Test;


import pages.Zivarasignin;

public class Zivarasigintest extends Baseclasss{
	
	
@Test
	
	public void testsignin()
	{
		
		Zivarasignin ob1=new Zivarasignin(driver);
		
		ob1.login();

		
		ob1.setvalues("mariarose1990@gmail.com", "shopforjewellery123");
		ob1.signin();
	
		
		
	}

}
