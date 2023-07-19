package testDrsheths;

import org.testng.annotations.Test;

import pagesDrsheths.Drshethsadditem;


public class Drshethsadditemtest extends Baseclas{
	
		
		@Test
		public void testshop()
		{
			
			Drshethsadditem ob4=new Drshethsadditem(driver);
			ob4.select();
			ob4.addtocart();
		
			
			
			
		}

}

