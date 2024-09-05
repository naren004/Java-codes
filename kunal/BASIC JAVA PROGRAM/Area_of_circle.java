import java.util.Scanner;

public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius = ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double area = pi*(Math.pow(radius,2));
        System.out.println("Area of circle is "+area +" cm sq.");
    }
}
