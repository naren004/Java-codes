import java.util.Scanner;

public class Area_Of_Par0allelogram {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter base = ");
        double b=sc.nextDouble();
        System.out.print("Enter height = ");
        double h=sc.nextDouble();
        double area = b * h;
        int ans = (int)Math.floor(area);
        System.out.println("Area Of Parallelogram = "+ans);

    }
}
