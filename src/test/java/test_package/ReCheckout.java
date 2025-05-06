package test_package;

import org.testng.annotations.Test;

import base_package.Base_RoyalEnfield;
import page_package.Checkoutpage;

public class ReCheckout extends Base_RoyalEnfield {
	
	
	@Test
	public void checkdetails() throws Exception
	{
			Checkoutpage ob=new Checkoutpage(driver);
			ob.details();
			Thread.sleep(1000);
			ob.buttonclick();
			ob.screenshot1();
		}

	}



