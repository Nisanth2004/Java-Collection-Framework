package com.collection8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo 
{

	public static void main(String[] args) throws IOException
	{
		Properties properties=new Properties();
		FileInputStream fileInputStream =new FileInputStream("//Users/sujiths// nisanth//Nisan-Java new -workspace//Collections//src//com//collection8//test.properties");
		properties.load(fileInputStream);
		System.out.println(properties);
		System.out.println("--------------------------");
        String string=properties.getProperty("dosai");
        System.out.println(string);
        System.out.println("--------------------------");
        properties.setProperty("dosai","90");
        System.out.println(properties);
        System.out.println("--------------------------");
        FileOutputStream fileOutputStream=new FileOutputStream("//Users/sujiths// nisanth//Nisan-Java new -workspace//Collections//src//com//collection8//test.properties");
        properties.store(fileOutputStream, "Updated price");
	}

}
