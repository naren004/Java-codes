import java.util.Scanner;

public class Area_of_rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the length ");
        double l=sc.nextDouble();
        System.out.println("Enter the width ");
        double w=sc.nextDouble();
        double area=l*w;
        double ans=Math.floor(area);
        System.out.println("area of rectangle is = "+ans);
    }
}
