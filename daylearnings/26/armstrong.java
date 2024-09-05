import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        // boolean ans = arm(n);
        // System.out.println(ans);
        for (int i = 100; i < 1000; i++) {
            if(arm(i)){
                System.out.println(i +" ");
            }
        }
    }
    static boolean arm(int n){
        double sum=0;
        int temp=n;
        while (n>0) {
            int r=n%10;
            sum +=Math.pow(r, 3);
            n /=10;
        }
        return sum==temp;
         
    }
}
