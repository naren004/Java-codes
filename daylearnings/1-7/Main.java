import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        System.out.println("enter num ");
        int n= sc.nextInt();
        int a = call(arr,n);
        System.out.println(a);
    }
    static int call(int[] arr, int n){
        
            if (arr.length == 0) {
                return -1;
            }
            for (int i = 0; i < arr.length; i++) {
                if(n == arr[i]){
                    return i;
                }
        }
        return -1;
    }
}