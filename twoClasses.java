import java.util.*;
public class twoClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea call2=new RectangleArea();
		Rectangle call=new Rectangle();
		call2.read_input();
		call.display();
		call2.display();
		
	}

}

class Rectangle
{
	public static int width, height;
	public void display()
	{
		System.out.println(width+" "+height);
	}
	
}

class RectangleArea extends Rectangle
{
	public void read_input()
	{
		Scanner sc= new Scanner(System.in);
		width=sc.nextInt();
		height=sc.nextInt();
	}
	
	public void display()
	{
		System.out.println(width*height);
	}
}