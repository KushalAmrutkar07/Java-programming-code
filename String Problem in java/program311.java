//Accept 2 string from  user & check it is anagram or not(angram  sathi pahile prepare)
//Listen -> Slient
//Study ->dusty
//race->care

import java.io.*;
import java.util.*;

class program311
{
  public static void main(String arg[])
  {
     Scanner sobj = new Scanner(System.in);
     
     System.out.println("Enter the String :");
     String str = sobj.nextLine();
    
     char arr[] = str.toCharArray();
     int Frequency[] = new int[26];
     int i = 0;

     for( i = 0; i < arr.length; i++)
     {
         Frequency[arr[i] -97]++;
     }
      
     for(i = 0; i < Frequency.length;i++)
     {
        System.out.println(Frequency[i]);
     }
  }
}