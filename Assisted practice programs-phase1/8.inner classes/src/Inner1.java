/// this an example of member inner class  
// a non static class that is created in inside of class and outside of method
class TestMemberOuter1{  
 private int data=30;  
 class Inner1{  
  void msg(){System.out.println("data is "+data);}  
 }  
 public static void main(String args[]){  
  TestMemberOuter1 obj=new TestMemberOuter1();  
  TestMemberOuter1.Inner1 in=obj.new Inner1();  
  in.msg();  
 }  
}  