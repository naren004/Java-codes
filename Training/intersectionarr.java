import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class intersectionarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int[] arr1=new int[n1];
        int[] arr2=new int[n2];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=sc.nextInt();
        }

       ArrayList<Integer> in = new ArrayList<>();
       Set<Integer> inter = new HashSet<>();
        
       for (var num : arr1) {
           in.add(num);
       }
       for (int i = 0; i < arr2.length; i++) {
        if(in.contains(arr2[i])){
            inter.add(arr2[i]);
        }
       }

       System.out.println(inter);

    }
}
