package com.blazedemo.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FilLib {

	public String getProperty1(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/data/atm.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
