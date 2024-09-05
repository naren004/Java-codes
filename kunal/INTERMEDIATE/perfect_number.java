import java.util.*;
public class perfect_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int sum=0;
        //int arr[]=new int[n];
        for (int i = 1; i <= n-1; i++) {
            if (n%i==0){
                sum +=i;
            }
        }
        System.out.println("SUM IS "+sum);
        if(sum==n){
            System.out.println("it is a perfect number");
        }
        else{
            System.out.println("not a perfect number");
        } 
        sc.close();
    }
}