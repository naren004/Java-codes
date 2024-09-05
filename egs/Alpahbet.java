import java.util.*;
class Alpahbet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt(); 
        double a=(Math.pow(s,n)%10);
        double a1=a%10;
        double a2=Math.pow(a1,m);
        double b=a2 / 10;
        System.out.println(Math.round(a2));

    }
}