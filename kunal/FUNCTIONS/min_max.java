import java.util.*;
public class min_max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=fmax(a,b,c);
        int min=fmin(a,b,c);
        System.out.println("max "+max);
        System.out.println("min "+min);
    }
    static int fmax(int a,int b ,int c){
        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        return max;

    }
    static int fmin(int a,int b,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
}
