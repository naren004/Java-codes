import java.util.*;

public class Matrix_Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        System.out.println("enter val m");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter val n");
        for (i = 0; i < b.length; i++) {
            for (j = 0; j < b.length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("result");
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c.length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
