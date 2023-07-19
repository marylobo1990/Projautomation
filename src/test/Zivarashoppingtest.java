package test;

import org.testng.annotations.Test;

import pages.Zivarashopping;

public class Zivarashoppingtest extends Baseclasss {
	
	@Test
	public void testshop()
	{
		Zivarashopping ob1=new Zivarashopping(driver);
		ob1.category();
		ob1.kempjewellery();
		ob1.select();
		ob1.addtocart();
		
		
	}

}
