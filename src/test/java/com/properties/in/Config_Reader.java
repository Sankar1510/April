package com.properties.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config_Reader {
	public static Properties p; 
	public  Config_Reader() throws Throwable  {
		
		    File l = new File("C:\\Users\\SRBTHAMIZH\\eclipse-workspace\\Cucumber4\\src\\test\\java\\com\\properties\\in\\configuration.properties");
			FileInputStream fi= new FileInputStream(l);
			 p = new Properties();
			p.load(fi);
   
	}
	public String GetBrowser() {
     String browser = p.getProperty("browser");
     return browser;
	}
	public String GetUrl() {
    String url = p.getProperty("url");
    return url;
	}
	public String GetUserName() {
    String username = p.getProperty("username");
    return username;
	}
	public String GetPassword() {
    String password = p.getProperty("password");
    return password;
	}
 
}
