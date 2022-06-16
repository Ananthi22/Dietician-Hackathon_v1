package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties prop;
	
	//This method to load properties from config.properties file
	
	public Properties init_prop() {
		
		prop=new Properties();
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\ragup\\git\\Dietician-Hackathon\\src\\test\\java\\configProperties\\config");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	return prop;
	
	}

}
