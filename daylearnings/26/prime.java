import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean ans=prime(n);
        System.out.println(ans);
    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int a=2;
        while(a*a <= n){
            if(n%a==0){
                return false;
            }
            a++;
        }
        return a*a > n;
    }
}
