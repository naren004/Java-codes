import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LargeSmallSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={3, 2, 1, 7, 5, 4};
        int[] arr1={1 ,8 ,0 ,2 ,3 ,5 ,6};

        System.out.println(ans(arr));
        System.out.println(ans(arr1));
    }
    public static int ans(int[] arr){
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        if (arr==null){
            
            return 0;
        }
        if(arr.length<=3){
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                even.add(arr[i]);
            }else{
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);

        // System.out.println(odd);
        // System.out.println(even);

        int oddele=odd.get(odd.size()-2);
        int evenele=even.get(even.size()-2);

        // System.out.println(oddele);
        // System.out.println(evenele);

        return oddele+evenele;
    }
    //  return 0;
}
