// public class ceili {
//     public static void main(String[] args) {
//         int[] arr = {2,3,5,9,14,16,18};
//         int target = 15;
//         int ans = ceiling(arr , target);
//         System.out.println("value = "+ans);
//     }
//     public static int ceiling(int[] arr , int target){
//         int start = 0;
//         int end = arr.length-1;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;
            
//             if (target < arr[mid]){
//                 end = mid - 1;
//             }
//             else if(target > arr[mid])
//             {
//                 start = mid +1;
//             }
//             else
//             {
//                 return arr[mid];
//             } 
//         }
//         return arr[start];
//     }
// }

import java.util.*;
public class ceili {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
        sc.close();
    }
    static int search(int[] arr,int target){
        int s = 0;
        int e = arr.length - 1;
        if (target > arr[arr.length - 1]){
            return -1;
        }
        while (s <= e) {
            int mid = s + (e - s )/2;
            if(target < arr[mid]){
                e = mid - 1;
            }
            else if (target > arr[mid]){
                s = mid + 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[s];
    }
}