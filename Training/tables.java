import java.util.*;
public class tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum =1;

        for (int i = 1; i <=10; i++) {
            int num = i*n;
            sum +=num;
            System.out.print(num+",");
        }
        System.out.println();
        System.out.println(sum-1);
    }
}