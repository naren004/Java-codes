import java.util.*;
public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter price of product ");
        int aprice =sc.nextInt();
        System.out.println("enter ");
        int dis=sc.nextInt();
        double ans=(aprice/100.0)*dis;
        double ans1=aprice-ans;
        System.out.println("discount price = "+ans);
        System.out.println("pay = "+ans1);
    }
}