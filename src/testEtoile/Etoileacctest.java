package testEtoile;

import org.testng.annotations.Test;

import pagesEtoile.Etoileacc;

public class Etoileacctest extends BaseclasE{
	
@Test
	
	public void testcreateaccnt()
	{
		Etoileacc ob2=new Etoileacc(driver);
		ob2.create();
		ob2.createaccnt();
		ob2.setvalues("Maria", "Rose", "mariarose1990@gmail.com", "clothesshop123");
		ob2.submit();
		
		
	}

}
