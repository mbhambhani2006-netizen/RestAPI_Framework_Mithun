package com.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class ConfigReader {
	
	public static Properties prop;
	
	public static String get(String key)  {
		
		String filepath=System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties";
				
		FileInputStream fis;
		try {
			fis = new FileInputStream(filepath);
			prop=new Properties();
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
		}

	}
	
	


