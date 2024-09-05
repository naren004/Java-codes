import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TABLE U WANT = ");
        int a = sc.nextInt();
        System.out.print("ENTER THE TABLE RANGE = ");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            System.out.println(i + "X" + a + "=" + (i * a));
        }
    }
}