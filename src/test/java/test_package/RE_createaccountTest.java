package test_package;

import org.testng.annotations.Test;

import page_package.RE_createaccount;
import base_package.Base_RoyalEnfield;

public class RE_createaccountTest extends Base_RoyalEnfield 
{
	@Test
	public void setup()
	{
		RE_createaccount ob=new RE_createaccount(driver);
		ob.log();
		ob.create();
		ob.setvalues();
		ob.datebirth();
		ob.set();
		ob.button();
	}

}

