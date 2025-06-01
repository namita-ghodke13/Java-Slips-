/*Slip - 13
Q.1) Write a program to accept a file name from command prompt, if the file exits then 
display number of words and lines in that file.*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileDemo 
{
      public static void main(String[] args) 
      {
             String fileName = args[0];
             File file = new File(fileName);
             if (!file.exists()) 
             {
                  System.out.println("The file '" + fileName + "' does not exists .");
                  return;
             }
             int lineCount = 0 , wordCount=0;
             try (BufferedReader br = new BufferedReader(new FileReader(file)))
             {
                  String line;
                  while ((line = br.readLine()) != null) 
                  {
                        lineCount++; 
                        String[] words = line.trim().split("\\s+"); 
                        wordCount += words.length; 
                  }
             } 
             catch (IOException e) 
             {
                  System.out.println("An error occurred while reading the file : " + e.getMessage());
                  return;
             }
             System.out.println("File: " + fileName);
             System.out.println("Number of Lines : " + lineCount);
             System.out.println("Number of Words : " + wordCount);
      }
}