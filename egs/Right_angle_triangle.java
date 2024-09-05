import java.util.*;
public class Right_angle_triangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the n value");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for (int j=n-i;j>0;j--) 
            {
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}