package kunal.assignments1;

import java.util.Scanner;

public class lcmhcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int hcf=fhcf(a,b);
        int lcm=flcm(a,b,hcf);

        System.out.println(lcm);
        System.out.println(hcf);

    }

    
    static int fhcf(int a , int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    static int flcm(int a,int b,int hcf){
        return (a*b)/hcf;
    }
}