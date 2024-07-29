package com.Properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args)throws Exception{
      Properties p =new Properties();
      
      FileInputStream fis =new FileInputStream("C:\\Sunny\\abc.properties");
      
      
      p.load(fis);
      System.out.println(p);
      
      String s=p.getProperty("sunny");
      System.out.println(s);
      
      p.setProperty("ram", "s1234");
      
      FileOutputStream fos=new FileOutputStream("C:\\Sunny\\\\abc.properties");
      p.store(fos, "Upadated by me for me");
	}
}
