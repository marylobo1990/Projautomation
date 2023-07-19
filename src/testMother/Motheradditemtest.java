package testMother;

import org.testng.annotations.Test;

import pagesMother.Motheradditem;

public class Motheradditemtest extends Baseclasm{
	
	@Test
	public void testshop()
	{
		
		Motheradditem ob4=new Motheradditem(driver);
		ob4.select();
		ob4.addtocart();
	
		
		
		
	}

}
