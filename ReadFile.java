package com.baseballaholic.CalloutsMod;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
	
  public static String[] Read() {
	  List<String> data = new ArrayList<String>();
    try {
      File myObj = new File("CoordData.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String d = myReader.nextLine();
        data.add(d);
        System.out.println(d);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return data.toArray(new String[data.size()]);
  }
}