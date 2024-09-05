package kunal.ass2;

import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine();
        String temp="";
        for (int i=s.length()-1;i>=0;i--){
            temp=temp+s.charAt(i);
            //System.out.print(s.charAt(i));
        }
        System.out.println(temp.toUpperCase());

        if (temp.equals(s)){
            System.out.println("it is a palindrome string");
        }
        else{
            System.out.println("it's not a palindrome string");
        }
    }
}
