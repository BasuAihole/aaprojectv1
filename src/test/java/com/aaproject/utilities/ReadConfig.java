package com.aaproject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig() {
		File src=new File("./Configuration/Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public String getApplicationurl() {
		String url=pro.getProperty("baseURL");
		return url;
	} public String getApplicationusername() {
		String username=pro.getProperty("UserName");
		return username;
	} public String getApplicationpassword() {
		String password=pro.getProperty("Password");
		return password;
	} public String getApplicationDriverpath() {
		String driverpath=pro.getProperty("driverpath");
		return driverpath;
	}
}
