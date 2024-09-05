import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius = ");
        int r=sc.nextInt();
        double area=areafun(r);
        double cir=cirfun(r);
        System.out.println("area if circle is "+area);
        System.out.println("circumference of circle is "+Math.ceil(cir));
        sc.nextInt();
    }
    static double areafun(int r){
        double pi=3.14;
        return 2*pi*Math.pow(r, 2);
    }
    static double cirfun(int r){
        double pi = 3.14;
        return 2*pi*r;
    }
}
