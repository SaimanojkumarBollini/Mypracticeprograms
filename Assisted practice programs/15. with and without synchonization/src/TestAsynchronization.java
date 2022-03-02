import java.lang.NullPointerException;
class Table1{  
void printTable1(int n){//method not synchronized  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread3 extends Thread{  
Table1 t;
void MyThread4(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable1(5);  
}  
  
}  
class MyThread4 extends Thread{  
Table1 t;  
MyThread4(Table1 t){  
this.t=t;  
}  
public void run(){  
t.printTable1(100);  
}  
}  
  
class TestAsynchronization{  
public static void main(String args[]){  
	Table1 obj = new Table1();//only one object 
	MyThread3 t1=new MyThread3(); 
	MyThread4 t2=new MyThread4(obj); 
t1.start();  
t2.start();  
}  
}