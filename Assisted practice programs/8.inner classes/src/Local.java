public class Local{  
 private int data=30;//instance variable  
 void display(){  
  class Localinnercls{  
   void msg(){System.out.println(data);}  
  }  
  Localinnercls l=new Localinnercls();  
  l.msg();  
 }  
 public static void main(String args[]){  
  Local obj=new Local();  
  obj.display();  
 }  
}  