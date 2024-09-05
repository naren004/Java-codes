package kunal.assignments1;

import java.util.Scanner;

public class ass1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int yr=sc.nextInt();
        if ((yr % 4 == 0 && yr % 100 !=0) || (yr % 400 == 0))
        {
            System.out.println(yr +" lepa yr");
        } 
        else
        {
            System.out.println("not");
        }
    }
}