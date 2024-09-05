import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        rev(arr);

    }
    static void rev(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
        swap(arr,s,e);
        s++;
        e--;
        }
    }
    static void swap(int[] arr,int s,int e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
