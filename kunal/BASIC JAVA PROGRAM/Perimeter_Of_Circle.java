import java.util.Scanner;

public class Perimeter_Of_Circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        double area = 2*3.14*r;
        System.out.println("Perimeter_Of_Circle is "+area);

    }
}