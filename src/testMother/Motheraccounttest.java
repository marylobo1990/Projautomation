package testMother;

import org.testng.annotations.Test;

import pagesMother.Motheraccount;

public class Motheraccounttest extends Baseclasm{
	
@Test
	
	public void testcreateaccnt()
	{
		Motheraccount ob2=new Motheraccount(driver);
		ob2.create();
		ob2.register();
		ob2.setvalues("Maria","Rose", "mariarose1995@gmail.com", "01-01-1995", "motherbaby");
		//ob2.setvalues("Maria", "Rose", "mariarose1995@gmail.com", "motherbaby123");
		ob2.submit();
		
		
	}


}
