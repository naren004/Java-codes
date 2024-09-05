import java.util.*;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter breath = ");
        double b=sc.nextDouble();
        System.out.print("Enter height = ");
        double h=sc.nextDouble();
        double ans = (b*h)/2;
        double area = Math.floor(ans);
        System.out.println("Area of Triangle is "+area);
    }
}