import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n /= 10;
        }
        if (temp == sum) {
            System.out.println(sum + " it is a palindrome number");
        } else {
            System.out.println(sum + " not a palindrome");
        }
    }
}