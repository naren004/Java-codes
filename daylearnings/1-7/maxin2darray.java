import java.util.*;
public class maxin2darray {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {34,34,2,5},
            {65,2,9,6}
        };  
        //int n=sc.nextInt();
        System.out.println(call(arr));
    }
    static int call(int[][] arr ){
        int max= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max){ 
                    max = arr[i][j];
                }
            }
        }
        return max;

    }
}
