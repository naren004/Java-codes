import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
    }
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
}
}


// this code not excuted