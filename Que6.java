import java.util.*;

class Question6 {
      String Name;
     int year;
     String Address;

    public void print() {
        System.out.print(Name +"           " + year + "                " + Address);
        System.out.println();
    }

    public static void main(String[] args) {
        // first object
    	Scanner sc = new Scanner(System.in);
    	
    	ArrayList<Question6> details=new ArrayList<Question6>();
    	System.out.println("Enter the no. of details you want to enter");
    	int n=sc.nextInt();
    	sc.nextLine();
    	for(int i=0;i<n;i++)
    	{
        Question6 emp1 = new Question6();
        System.out.println("Name: ");
        emp1.Name = sc.nextLine();
        System.out.println("Address: ");
        emp1.Address = sc.nextLine();
        System.out.println("Year: ");
        emp1.year = Integer.parseInt(sc.nextLine());
        details.add(emp1);
    	}
    	 System.out.println("Name:    " + "Year of Joining:  " + "             Address          ");
    	details.stream().map(x->x).forEach(s->s.print());
    }

}
