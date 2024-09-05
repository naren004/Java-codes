import java.util.Scanner;

public class hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int hcf=callhcf(a,b);
        System.out.println("hcf = "+hcf);
        int lcm=calllcm(a,b,hcf);
        System.out.println("lcf = "+lcm);
        sc.close();
    }
    public  static int callhcf(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int calllcm(int a,int b , int hcf){
        return (a*b)/hcf;
    }
}