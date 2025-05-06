package test_package;

import org.testng.annotations.Test;

import base_package.Base_RoyalEnfield;
import page_package.Relogin_page;
import utilities_package.Excelutils;


public class ReloginTest extends  Base_RoyalEnfield
{
	@Test
	public void datadriven() throws Exception
	{
		Relogin_page ob=new Relogin_page(driver);
		
		String xl="C:\\Users\\sreer\\OneDrive\\Desktop\\RoyalEnfield2.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			ob.logicon();
			Thread.sleep(2000);
			String Username=Excelutils.getCellValString(xl,Sheet,i,0);
			System.out.println("Username="+Username);
			
			String pwd=Excelutils.getCellValString(xl,Sheet,i,1);
			System.out.println("Password="+pwd);
			
			
			ob.setvalues(Username, pwd);
			ob.login_btn();
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			
	    }
		ob.logosearch();
		ob.text();
		ob.screenshot();
		
		

    }
}
