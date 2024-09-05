import java.util.Scanner;

public class Area_Of_Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("BY using 3 Methods \n");
        System.out.println("1. Using the diagonals");
        System.out.println("2.Using the side and height");
        System.out.println("3.Using the side and internal angle");

        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("1. Using the diagonals");
                System.out.println("enter d1 ");
                double d1=sc.nextDouble();
                System.out.println("enter d2 ");
                double d2=sc.nextDouble();
                System.out.println("Area of Rhombu is = "+((1.0/2)*d1*d2));
                break;

            case 2:
                System.out.println("2.Using the side and height");
                System.out.println("enter lenght ");
                double l=sc.nextDouble();
                System.out.println("enter height ");
                double h=sc.nextDouble();
                System.out.println("Area of Rhombu is = "+(l*h));

            case 3:
                System.out.println("Using the side and internal angle: ");
                System.out.println("enter side ");
                double s=sc.nextDouble();
                System.out.println("enter angle in degress ");
                double a=sc.nextDouble();
                double area=s*s*Math.sin(Math.toRadians(a));
                int ans=(int)Math.floor(area);
                System.out.println("Area of Rhombus is = "+ans);
                break;

            default:
                System.out.println("INVALID OPERATION");
                break;
        }
    }
}
