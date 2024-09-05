import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the INR ");
        double inr=sc.nextDouble();
        double rate=0.012;
        double ans = usd(inr , rate);
        System.out.printf("%.1f",ans);
    }
    static double usd(double inr , double rate){
        //System.out.print("USD IS ");
        return inr*rate;
    }
}