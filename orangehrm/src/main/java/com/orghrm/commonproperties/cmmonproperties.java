package com.orghrm.commonproperties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.checkerframework.common.reflection.qual.GetClass;

public class cmmonproperties  {


	static FileReader fileReader;

	public  void propertiesload() {

		

		Properties properties = new Properties();

	    try {
			properties.load(getClass().getResourceAsStream("/confi.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		constance_value.app_url=	properties.getProperty("Application_URL");
		constance_value.browser=	properties.getProperty("Browser_name");
		constance_value.username=	properties.getProperty("Username");
		constance_value.password=	properties.getProperty("Password");
		constance_value.chromebrowser=	properties.getProperty("Chrome_driver_location");
		constance_value.firefoxbrowser=	properties.getProperty("firefox_driver_location");


	}

}
