/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files 
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

/**
 *
 * @author save
 */
public class ReadFille {
    
    public String readFille(){
        
        String data ="";
        
         try {
      File myObj = new File("C:\\Users\\save\\Documents\\NetBeansProjects\\Acp_Core_v.1.3.0\\src\\swing\\filleA.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
         data = myReader.nextLine();
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        
        return data;
    }
    
    
    
}
