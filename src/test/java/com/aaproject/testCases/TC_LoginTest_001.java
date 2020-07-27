package com.aaproject.testCases;

import org.testng.annotations.Test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.aaproject.pageobject.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
        
	@Test
	public void LoginTest() 
	{
	    driver.get(baseURL);
	    
	    LoginPage lp=new LoginPage(driver);
	    
	    lp.setUserName(UserName);
	    lp.setPassword(Password);
	    lp.ClickButton();
	    
	    if (driver.getTitle().equals("Guru99  Bank Manager HomePage")) 
	    {
			Assert.assertTrue(true); 
			} else {
				Assert.assertTrue(false);
		}
	    
	}
} 
