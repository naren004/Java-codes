import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        call(n);
    }
    static void call(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int col = i > n ? 2 * n - i : i ;
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}