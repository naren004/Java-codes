import java.util.*;
public class floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,9,14,16,18};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int ans = search(arr, target);
        System.out.println(ans);
    }
    public static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}

