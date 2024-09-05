package kunal.ass2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Enter ur num ");
        int sum=0;
        int temp=n;
        while (n>0) {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp == sum){
            System.out.println(temp+" it is a palindrome number");
        }
        else{
            System.out.println(temp +" not a planidrome number");
        }
    }
}
