import java.util.Scanner;

public class Area_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ");
        double a=sc.nextDouble();
        double s=Math.sqrt(3);
        double area = (s)*a*a/4;
        int ans = (int)Math.floor(area);
        System.out.println(" Area_Of_Equilateral_Triangle "+ ans);

    }
}