// TTake integer inputs till the user enters 0 and print the largest number from all.

import java.util.*;

public class largest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        while (true) {
            int n=sc.nextInt();
            if(n==0){
                break;
            }
             else if(n>max){
                max=n;
            }
        }
        System.out.println(max);   
    }
}
