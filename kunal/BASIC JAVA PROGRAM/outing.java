//Kunal is allowed to go out with his friends only on the even days of a given month. 
//Write a program to count the number of days he can go out in the month of August.
import java.util.*;

public class outing {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the days in augest month");
        int n=sc.nextInt();
        int sum=0;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                sum ++;
                //System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}