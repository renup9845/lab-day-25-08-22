/*
  Program of File Handling take input from the user
  By Prashant Bansal 
 */

import java.io.FileOutputStream;
import java.util.Scanner;
public class CreateFile
{
    public static void main(String[] args) {
        try {
            //object of Scanner class
            Scanner sc=new Scanner(System.in);        
            System.out.print("Enter the file name: ");
            //variable name to store the file name
            String name=sc.nextLine();
            // true for append mode
            FileOutputStream fos=new FileOutputStream(name, true); 
           
            System.out.print("Enter file content: ");
           
            //str stores the string which we have entered
            String str=sc.nextLine()+"\n";
           
            //converts string into bytes
            byte[] b= str.getBytes();
           
            //writes bytes into file
            fos.write(b);
            //close the file
            fos.close();            
            System.out.println("file saved.");
        }
        catch(Exception e) {
            
            e.printStackTrace();
        }
    }
}
