import java.util.*;
public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("enter the number = ");
        int num=sc.nextInt();
        System.out.println("enter the power value = ");
        int pow=sc.nextInt();
        double ans1 = call(num,pow);
        int ans =(int)(ans1);
        System.out.println(+num +" power of "+pow +" is "+ans+".");
        sc.close();
    }
        public static double call(int num,int pow){
            return Math.pow(num,pow);
        }
}