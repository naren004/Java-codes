import java.util.Scanner;

public class maxelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr={23, 45, 82 ,27, 66, 12, 78, 13, 71, 86 };
        int max = arr[0];
        for (int j = 1; j < n; j++) {
            if(max < arr[j]){
                max = arr[j];
            }
        }
        System.out.println(max);
    }
}