import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int age =sc.nextInt();
        String ans=find(age);
        System.out.println(ans);
    }
    static String find(int age){
        if (age>=18){
            return "vote";
        }
        return " not vote";
    }
}
