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
public class WritteFille {
    
            Cesar cear = new Cesar();
            ReadFille readfille= new ReadFille();
    
    public void writefille(String fille_name,String word){
        
        if(fille_name=="fille_a"){
        
        fille_name="C:\\Users\\save\\Documents\\NetBeansProjects\\Acp_Core_v.1.3.0\\src\\swing\\filleA.txt";
        
          try {
      FileWriter myWriter = new FileWriter(fille_name);
      myWriter.write(word);
      myWriter.close();
      System.out.println("Successfully  to save the word in file A.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        }
        else{
            fille_name="C:\\Users\\save\\Documents\\NetBeansProjects\\Acp_Core_v.1.3.0\\src\\swing\\filleB.txt";
             try {
      FileWriter myWriter = new FileWriter(fille_name);
      myWriter.write(cear.crypt(3,readfille.readFille()));
      myWriter.close();
      System.out.println("Successfully to save the word in file B.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        }
        
       
    
    
    }
    
}
