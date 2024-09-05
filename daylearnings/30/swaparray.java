import java.util.*;
class Main{
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5};
        System.out.println(Arrays.toString(arr));
        int a=1;
        int b=2;
        swap(arr,a,b);
    }
    static void swap(int[] arr ,int a,int b){
        int temp=arr[a];
        arr[1]=arr[b];
        arr[2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
