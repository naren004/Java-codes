import java.util.Arrays;

public class varilableargs {
    public static void main(String[] args) {
       // fun(1,2,3,4,5,6,7,8,9,0);
        //multiple(1,2,"naren","mani","rk");

        int ans=sum(2,3);
        System.out.println("sum = "+ans);

        int ans1=sum(2,3,5);
        System.out.println("sum = "+ans1);

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}