import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        for (int i = m; i < n; i++) {
            if(i == palin(i)){
                System.out.println(i);
            }
        }
    }
    static int palin(int n){
        int sum = 0;
        while (n>0) {
            int dig=n%10;
            sum = (sum * 10)+dig;
            n /=10;
        }
        return sum;
    }
}