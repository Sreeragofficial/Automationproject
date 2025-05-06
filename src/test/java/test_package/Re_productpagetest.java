package test_package;

import org.testng.annotations.Test;

import base_package.Base_RoyalEnfield;
import page_package.Re_productpage;


public class Re_productpagetest extends Base_RoyalEnfield
{
	@Test
	public void set() throws Exception
	{
		Re_productpage ob=new Re_productpage(driver);
		ob.subclk();
		ob.cart_click();
		
	}

}
