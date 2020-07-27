package com.aaproject.testCases;

import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aaproject.utilities.ReadConfig;

public class BaseClass {
   
	ReadConfig readconfig=new ReadConfig();
	public String baseURL=readconfig.getApplicationurl();
	public String UserName=readconfig.getApplicationusername();
	public String Password=readconfig.getApplicationpassword();
	public static WebDriver driver;
	
	//public static Logger Logger;
	
	@Parameters("browser")
	@BeforeClass
	   	
	public void setup(String browser) {
		  // Logger =Logger.getLogger("aaproject");
	      // PropertyConfigurator.configure("Log4j.properties");
		if(browser.equals("FireFox")) {
			// System.setProperty("WebDriver.chrome.driver", readconfig.getApplicationDriverpath());
		driver=new FirefoxDriver();
		} else if(browser.equals("Chrome")) {
			// System.setProperty("WebDriver.chrome.driver", readconfig.getApplicationDriverpath());
			driver=new ChromeDriver();
			} else if(browser.equals("IE")) {
				// System.setProperty("WebDriver.IE.driver", readconfig.getApplicationDriverpath());
				driver=new InternetExplorerDriver();
				}
	}
	
	@AfterClass
		public void tearDown() {
		driver.quit();
			}
}
