package kunal.ass2;
import java.util.*;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int l=Integer.toString(n).length();
        double sum=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            double p=Math.pow(r,l);
            sum+=p;
            n=n/10;
        }
        int ans=(int)(sum);
        //System.out.println(ans);

        if(ans == temp){
            System.out.println(ans +" it is a armstrong number");
        }
        else{
            System.out.println(ans +" not a armstrong number");
        }
    }
}