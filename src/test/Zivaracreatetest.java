package test;

import org.testng.annotations.Test;

import pages.Zivaracreate;

public class Zivaracreatetest extends Baseclasss{
	
	@Test
	
	public void testcreateaccnt()
	{
		Zivaracreate ob2=new Zivaracreate(driver);
		ob2.create();
		ob2.createoption();
		ob2.setvalues("Maria", "Rose", "mariarose1990@gmail.com", "shopforjewellery123");
		ob2.createbutton();
		
		
	}
	

}
