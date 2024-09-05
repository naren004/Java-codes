import java.util.Arrays;
import java.util.Scanner;

public class search2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr={
            {1,2,3,4},
            {34,34,2,5},
            {65,2,9,6}
        };    
        int n= sc.nextInt();
        int[] ans = scr(arr , n);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
    static int[] scr(int[][] arr,int n){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == n){
                    return new int[]{i,j};
                }
            }
            
        } 
        return new int[]{-1,-1};
    }
}