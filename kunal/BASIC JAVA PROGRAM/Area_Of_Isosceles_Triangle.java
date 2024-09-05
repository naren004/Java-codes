import java.util.Scanner;

public class Area_Of_Isosceles_Triangle {
    public static void main(String[] args) {
        double a = 1.0/2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter breath = ");
        double b = sc.nextDouble();
        System.out.print("Enter height = ");
        double h = sc.nextDouble();
        double area = (a) * b * h;
        int  ans = (int)(Math.floor(area));
        System.out.println("Area of isosceles triangle = " + ans);
    }
}
    