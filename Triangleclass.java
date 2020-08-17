import java.util.Scanner;

public class Triangle {
    public double areaOfTri(double a, double b, double c) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            return area;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side : ");
        double a = sc.nextDouble();
        System.out.println("Enter 2nd side : ");
        double b = sc.nextDouble();
        System.out.println("Enter 3rd side : ");
        double c = sc.nextDouble();
        Triangle obj = new Triangle();
        if((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("The area of triangle is : " + obj.areaOfTri(a,b,c));
        }
        else {
            System.out.println("The triangle with " + a + "," + b + "," + c + " sides does not exist!!");
        }
    }
}