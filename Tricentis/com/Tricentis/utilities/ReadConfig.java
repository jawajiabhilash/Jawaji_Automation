package com.Tricentis.utilities;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang.StringUtils;


public class ReadConfig {

	static Properties pro = new Properties();

	public static String getPropertyValueByKey(String key) throws Exception {
		// Load the from properties file

		String path = "C:\\Users\\User\\eclipse-workspace\\Demo\\Tricentis\\com\\Tricenties\\testData\\config.properties";
		FileInputStream fi = new FileInputStream(path);
		pro.load(fi);
		
		//Read Data	
		String value = pro.getProperty(key).toString();

		if (StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key: " + key + " in properties file.");
		}

		return value;

	}

}
