import java.util.Scanner;

public class scopestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        System.out.println(a);
        {
            a="naren";
            System.out.println(a);
        }
        System.out.println(a);

    }
}
