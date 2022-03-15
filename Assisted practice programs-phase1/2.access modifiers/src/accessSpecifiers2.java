//Using private access specifiers
class priaccessspecifier 
{ 
   private void display() 
    { 
        System.out.println("i'm private specifier"); 
    } 
} 

public class accessSpecifiers2 {

	public static void main(String[] args) {
		//private
		
		priaccessspecifier  obj = new priaccessspecifier(); 
        //trying to access private method of another class but cannot the above private specifier
        //obj.display();

	}
}