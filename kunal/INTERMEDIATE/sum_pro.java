import java.util.*;
public class sum_pro {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        while (n>0) {
            int r=n%10;
            sum +=r;
            pro *=r;
            n /=10;
        }
        int ans=pro-sum;
        System.out.println("ans is "+ans);
    }
}
