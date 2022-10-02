import java.lang.*;

class Base
{

 public int i,j;

  public void fun()  //defination
  { System.out.println("Base fun");}
  
 public void gun()  //defination
 {System.out.println("Base gun");}

  public void sun()  //defination
  { System.out.println("Base sun");}

}

class Derived extends Base
{

  public int x,y;
   
  public void fun()  //overriding
  {System.out.println("Derived fun");}
  
  public void sun()  //overriding
  {System.out.println("Derived sun");}
  
   public void run()  //defination
  {System.out.println("Derived run");}
  
 } 

class Virtual
{
  public static void main(String arg[])
  {

     //Base bobj = new Base();  //No casting
     //Derived dobj = new Derived();   //No casting
    
     Base obj = new Derived();   //upcasting
    // Derived obj = new Base();   //downcasting

      obj.fun();   //Derived fun
      obj.gun();  //base gun
      obj.sun();  //Derived sun
      // obj.run();
   }

}




