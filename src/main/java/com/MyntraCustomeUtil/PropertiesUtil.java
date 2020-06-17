package com.MyntraCustomeUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	
 public static String getProperty(String Key){
	 String value=null;
	 try {
		FileInputStream fis=new FileInputStream("/MyntraKeywordTest/src/main/resources/ObjectRepository2.properties");
		Properties prop=new Properties();
		prop.load(fis);
		value=prop.getProperty("key");
		
	} catch (FileNotFoundException e) {
		System.out.println("Unable to Open file Object repository");
		e.printStackTrace();
	} catch (IOException e) {
		System.out.println("File Not Found");
		e.printStackTrace();
	}
	 return value;
	 
	 
 }


	
}
	
	


