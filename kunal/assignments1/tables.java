package kunal.assignments1;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        for (int i=1;i<=h;i++){
            System.out.println(i +"*" +n +" = " +(i*n));
        }
    }
}
