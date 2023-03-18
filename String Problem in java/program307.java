//Accept string from user & max word display from word (yachat last first whitespaces jat nahi)
import java.io.*;
import java.util.*;

class program307
{
   public static void main(String arg[])
   {
      Scanner sobj = new Scanner(System.in);
    
      System.out.println("Enter the string :");
      String str = sobj.nextLine();
      
      String newstr = str.replaceAll("\\s+"," ");
      String newstr2 = newstr.trim(); 
      
      String arr[] = newstr2.split(" ");
      int iPos = 0;

      int iMax = 0;   
      
      for(int i = 0; i < arr.length; i++)
      {
         if(arr[i].length() >= iMax)
         {
            iMax = arr[i].length();
            iPos = i;
         }


      }
      System.out.println("Length of largest word is :"+iMax);  
     System.out.println("Largest word is :"+arr[iPos]);    
}
}