package com.basicPrograms;

import java.io.File;
import java.io.IOException;

public class FirstProg {

	public static void main(String[] args) throws IOException {
      File f =new File("sunny123.txt");
      System.out.println(f.exists());
      
      f.createNewFile();
      System.out.println(f.exists());
	}

}
