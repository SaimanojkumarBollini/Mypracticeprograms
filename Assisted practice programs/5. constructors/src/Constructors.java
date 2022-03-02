class display{ 
	int c;
	public void display()        //default method
	{
		
		System.out.println("I'm default constructor");
	}
	public void display(int c)       //parameterized method
	{ 
		
		System.out.println("I'm parameterized constructor");
	}
	
}
public class Constructors {

	public static void main(String[] args) {
		
     display ob1=new display();
     display ob2=new display();
     ob1.display();
     ob2.display(20);
     
     
	}

}
