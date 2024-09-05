public class perfectsq {
    public static void main(String[] args) {
        int[] arr={2,25,89,61,35,36,78,49,50,25};
        System.out.println(count(arr));
    }
    public static int count(int[] arr){
        int c=0;
        for (int i = 0; i < arr.length; i++) {
            double x=Math.sqrt(arr[i]);
            int a =(int)x;
            // System.out.println(a);
            // System.out.println(x);
            if(a*a==arr[i]){
                c +=1;
            }
        }
        return c;
    }
}