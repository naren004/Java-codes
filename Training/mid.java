import java.util.Arrays;
import java.util.Scanner;

public class mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));
        int count = arr.length;
        int ans = (count + 1)/2;
        System.out.println(arr[ans]);
        // System.out.println(Arrays.toString(arr));
    }
}