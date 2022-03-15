// class is having  default access modifier
class defAccessSpecifier    // without specifying  any specifier . it is treated as default
{ 
  void display() 
     { 
         System.out.println("im default specifier"); 
     } 
} 

public class accessspecifier1 {

	public static void main(String[] args) {
		//default
		
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}