package testDrsheths;

import org.testng.annotations.Test;
import pagesDrsheths.Drshethsaccount;

public class Drshethsaccounttest extends Baseclas{
	
@Test
	
	public void testcreateaccnt()
	{
		Drshethsaccount ob2=new Drshethsaccount(driver);
		ob2.create();
		ob2.createaccnt();
		ob2.setvalues("Maria", "Rose", "mariarose1990@gmail.com", "shopforjewellery123");
		ob2.submit();
		
		
	}

}
