//Vitual Data base Manegment system(CVDBMS)

import java.lang.*;
import java.util.*;

//Database table /schema
class Student
{

    public int RID;
    public String Name;
    public int Salary;    

    private static int Generator ;

   static
   {
       Generator = 0;
   }


    public Student( String str, int value)
    {
       this.RID = ++Generator;
       this.Name = str;
       this.Salary = value;
    }
    
    public void DisplayData()
    {
       System.out.println(this.RID + "\t" + this.Name + "\t" + this.Salary);
    }

}


class program363
{
   public static void main(String arg[])
   {
 
      Student obj1 = new Student("Kushal",1000);
      Student obj2 = new Student("Piyush",2000);
      Student obj3 = new Student("Vishal",3500);
      Student obj4 = new Student("Shubham",16500);

      obj1.DisplayData();
     obj2.DisplayData();
     obj3.DisplayData();
     obj4.DisplayData();

   }
}