//apurn rahila aahe ha code
//Accept number from user and find first & last nibble is on or import java.lang.*;
import java.util.*;

class program348
{
   public static void main(String arg[])
   {
       Scanner sobj = new Scanner(System.in);
      
       System.out.println("Enter number");
       int iNo = sobj.nextInt();
     
       int iMask = 0xf000000f; 
       int iResult = 0;
        
       iResult = iNo & iMask;
     
       if(iResult == iMask)
      {
          System.out.println("First niible and last niible is completely on");
      }
      else
     {
         System.out.println("First niible and last niible is off");
     }
  }
}