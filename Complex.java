import java.util.*;
public class Complex {
	 double x,y;
	    void addition(double a, double c, double b,double d)
	    {   x = (a+b);
	        y= (c+d);
	        System.out.println(+x + " +  ("+ y +"i )");
	    }
	    void substraction(double a, double c, double b,double d)
	    {   x = (a-b);
	        y= (c-d);
	        System.out.println(+x + " +  ("+ y +"i )");
	    }
	    void multiplication(double a, double c, double b,double d)
	    {   x = (a*b-(c*d));
	        y= (a*d+(b*c));
	        System.out.println(x + " +  ("+ y +"i )");
	    }

	    public static void main(String[] args) {
		// write your code here
	        Complex comp = new Complex();
	        Scanner sc = new Scanner(System.in);
	        double a,b,c,d;

	        System.out.println("Enter the real part of 1st Complex No: ");
	        a=sc.nextDouble();
	        System.out.println("Enter the complex part of 1st Complex No: ");
	        c=sc.nextDouble();
	        System.out.println("Enter the real part of 2nd Complex No: ");
	        b=sc.nextDouble();
	        System.out.println("Enter the complex part of 2nd Complex No: ");
	        d=sc.nextDouble();

	        comp.addition(a,c,b,d);
	        comp.substraction(a,c,b,d);
	        comp.multiplication(a,c,b,d);
	    }
}
