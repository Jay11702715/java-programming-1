
import java.util.*;

class Employee
{
	int empId,empSalary;
	String empName,empDesignation,empLocation;
	
	public void setId(int id) {
		empId=id;
	}
	
	public void setSalary(int sal) {
		empSalary=sal;
	}
	public void setName(String name) {
		empName=name;
	}
	
	public void setDesig(String desig) {
		empDesignation=desig;
	}
	
	public void setLoc(String loc) {
		empLocation=loc;
	}
	
	public int getId()
	{
		return empId;
	}
	public int getSalary()
	{
		return empSalary;
	}
	
	public String getName()
	{
		return empName;
	}
	
	public String getDesig()
	{
		return empDesignation;
	}
	
	public String getLoc()
	{
		return empLocation;
	}
	
	public String toString()
	{
		return empName+" "+empId+" "+empSalary+" "+empDesignation+" "+empLocation;
	}
}


class Main
{
	@SuppressWarnings("resource")
	public static void main(String []args)
	{
		ArrayList<Employee> emp=new ArrayList<Employee>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of Employee details you want to add");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Employee obj=new Employee();
			System.out.println("Enter you Id emp"+i);
			obj.setId(sc.nextInt());
			System.out.println("Enter you Salary");
			obj.setSalary(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter you Name:-");
			obj.setName(sc.nextLine());
			System.out.println("Enter you Designation:-");
			obj.setDesig(sc.nextLine());
			System.out.println("Enter you Location:-");
			obj.setLoc(sc.nextLine());
			emp.add(obj);
		}
		
		emp.stream().filter(s->s.getSalary()>50000).forEach(l->System.out.println(l.getSalary()));
		emp.stream().filter(s->(s.getLoc()).charAt(0)=='M').forEach(l->System.out.println(l.getLoc()));
		emp.stream().filter(s->(s.getLoc()).charAt((s.getLoc()).length()-1)=='E').forEach(l->System.out.println(l.getDesig()));
	}
}
