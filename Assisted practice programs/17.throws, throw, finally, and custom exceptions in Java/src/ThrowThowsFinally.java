import java.io.*;
class Main { 
    //declare exception using throws in the method signature
  void testMethod(int num) throws IOException, ArithmeticException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
     else
        throw new ArithmeticException("ArithmeticException");
  } 
}class ThrowThowsFinally{ 
  public static void main(String args[]){ 
   try{ 
       //this try block calls the above method so handle the exception
	   Main obj=new Main(); 
     obj.testMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
   finally{
       System.out.println("the program was completed");
   }  
  }
}