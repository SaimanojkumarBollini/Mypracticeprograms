// the below program for the  different return types in java  
class Return{
	 int a=10;
	 double b=20.5;
	 float  c=(float) 30;
	 char  d='H';
	public int return1() {
		
		System.out.println("I'm integer type and my value is: " +a);
		return a;
	}
public double return2() {
		
		System.out.println("I'm double type and my value is: " +b);
		return b;
	}
public float return3() {
	
	System.out.println("I'm float type and my value is: " +c);
	return (float) c;
}
public char return4() {
	
	System.out.println("I'm character type and my value is: " +d);
	return d;
}
}
public class Returntypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Return ob1=new Return();
        ob1.return1();
        
        Return ob2=new Return();
        ob2.return2();
        
        Return ob3=new Return();
        ob3.return3();
        
        Return ob4=new Return();
        ob4.return4();
	}

}
