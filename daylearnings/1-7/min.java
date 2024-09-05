public class min {
    public static void main(String[] args) {
        int[] arr={5,8,33,4,25,-98};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}