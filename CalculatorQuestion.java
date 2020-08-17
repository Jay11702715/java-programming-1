
import java.util.*;


class operation
{

	interface Interface1
	{
		int op(int a, int b);
	}
	
	public int operate(int a, int b, Interface1 inf)
	{
		return inf.op(a,b);
	}
}

public class CalculatorQuestion extends operation {
	
	public static void main(String []args)
	{
		
		operation obj=new operation(); 
		Interface1 addition=(int a,int b) -> a + b;
		
		Interface1 product = (int a, int b) -> a*b;
		
		Interface1 difference = (int a, int b) -> Math.abs(a-b);
		
		Interface1 safeDivision =(int a, int b) -> a/b;
		
		System.out.println(obj.operate(5, 4,addition));
		System.out.println(obj.operate(5, 4,product));
		System.out.println(obj.operate(5, 4,difference));
		System.out.println(obj.operate(5, 4,safeDivision));
		
		
	}

}



