import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the time (years): ");
        int t = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int r = sc.nextInt();
        
        double si = si(p, t, r);
        System.out.println(si + " is the simple interest");
        
        sc.close();
    }
    
    static double si(int p, int t, int r) {
        return (p * t * r) / 100.0;
    }
}
