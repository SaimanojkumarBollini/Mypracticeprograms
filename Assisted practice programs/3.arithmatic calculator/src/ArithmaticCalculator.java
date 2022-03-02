








import java.util.Scanner;
public class ArithmaticCalculator {

public static void main(String[] args) {
// TODO Auto-generated method stub
char operator;
double a,b,result;
Scanner sc=new Scanner(System.in);
System.out.println("choose the operator: +,-,*,/,% :");
operator=sc.next().charAt(0);
if (operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%')
{
System.out.println("enter A value:");
a=sc.nextDouble();
System.out.println("enter B value:");
b=sc.nextDouble();
switch(operator) {

case '+':result=a+b;
        System.out.println("result of addition: " +result);
        break;
case '-':result=a-b;
                 System.out.println("result of substraction: " +result);
                 break;
case '*':result=a*b;
                 System.out.println("result of multiplication: " +result);
                 break;
case '/':result=a/b;
                 System.out.println("result of division: " +result);
                 break;
case '%':result=a%b;
                 System.out.println("result of modular division: " +result);
                 break;
        default: return ;
       
}

}
else {
	System.out.println("wrong operator u have choosed:");
}
}

}