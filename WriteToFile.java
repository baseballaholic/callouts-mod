package com.baseballaholic.CalloutsMod;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteToFile {
  public static void Write() {
    try {
      FileWriter myWriter = new FileWriter("CoordData.txt");
      myWriter.write(CalloutHUD.instance.getX() + "\n" + CalloutHUD.instance.getY());
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
