public class maxitem {
    public static void main(String[] args) {
        int arr[]={1,56,26,98,6};
        System.out.println("max is "+max(arr));
    }
    static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
