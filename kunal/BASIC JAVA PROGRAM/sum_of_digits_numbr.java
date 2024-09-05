import java.util.*;
public class sum_of_digits_numbr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        while (n>0) {
            int r=n%10;
            sum +=r;
            n /=10;
        }
        System.out.println("THE sum digits is "+sum);
    }
}