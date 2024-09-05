import java.util.Scanner;

public class binary_ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,6,8,9,12,36,0};
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < arr.length; i++) {
        //     if (arr[i]==n) {
        //         System.out.println("element "+n +" found array index "+i);
        //     }
        //     }
        System.out.println(arr.length);
        int n = arr.length / 2;
        System.out.println(arr[n]);
    }
}