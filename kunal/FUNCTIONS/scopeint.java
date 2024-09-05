import java.util.Scanner;

public class scopeint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    //     int a=10;
    //     int b=20;
    //     random(a,b);

    // }
    // static void random(){
    //     int d=0;
    //     System.out.println(d);
    // }

    int a=100;
    int b=30;
    System.out.println(a);
    {
        a=80;
        System.out.println(a);
    }
    System.out.println(a);
}
}