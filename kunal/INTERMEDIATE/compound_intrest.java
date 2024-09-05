import java.util.Scanner;

public class compound_intrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter principal amount");
        double p=sc.nextDouble();

        System.out.println("enter rate of intrest ");
        double r=sc.nextDouble();

        System.out.println("enter years");
        double y=sc.nextDouble();

        double ans = call(p,y,r); 
        System.out.println("compoud intrest is "+ans);
        sc.close();
        
    }
    public static double call(double p,double r , double y){
        return p * Math.pow(1.0+r/100.0,y) - p;
    }
}
