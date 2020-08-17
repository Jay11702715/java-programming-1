import java.util.Scanner;

class UserException extends Exception {
    public UserException() {
        System.out.println("Error!!! Handling Custom Exception \n String Found......");
    }
}

class User {
    public <E> void Method(E obj) {
        try { 
        	
        		char c=String.valueOf(obj).charAt(0);
        		if(Character.isDigit(c))
        		{
        			double number = Double.parseDouble(String.valueOf(Integer.parseInt(String.valueOf(obj))));
                    System.out.println(number * 0.66666667);
        		}
        		else
        		{
        			throw new UserException();
        		}
        		
            
            }
            catch (UserException e)
            {
            System.out.println(e.getMessage());
            }
        	catch(Exception e)
        {
        		System.out.println("You have entered the mix of integer and string please be on either side");
        }
    }
}

public class Exception11{
    public static void main(String[] args) {
        User us = new User();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        us.Method(sc.next());
        us.Method(sc.next());
    }
}
