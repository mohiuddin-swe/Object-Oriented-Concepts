//Md. Shamim Ahamed
//Student ID: 213-35-775

import java.util.Scanner;
public class Calculator {




    public static void main(String[] args)
	{
        Scanner in = new Scanner(System.in);
		
        System.out.println("Enter two elements: ");
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println("The addition is " + add(a,b) );
        System.out.println("The Subtraction is " +sub(a,b) );
        System.out.println("The Multiplication is " + multi(a,b) );
        System.out.println("The Division is " + div(a,b) );

    }
	

    static double add( double a, double b )
	{
        return a+b;
    }
	
	
    static double sub( double a, double b )
	{
        return a-b;
    }
	
	
    static double multi( double a, double b )
	{
        return a*b;
    }
	
	
    static double div( double a, double b )
	{
        return a/b;
    }

}
