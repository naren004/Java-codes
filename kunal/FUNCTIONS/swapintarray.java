import java.util.Arrays;
import java.util.Scanner;

public class swapintarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    static void change(int[] nums){
        nums[0]=0;
    } 
}