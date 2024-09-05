import java.util.*;
class Volume {
    public int l,bb,h;
    public Volume(int a,int b,int c){
        l=a;
        bb=b;
        h=c;
    }
    public int peri(){
        return 4*(l+bb+h);
    }
    public int vol(){
        return l*bb*h;
    }
}
public class soti3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Volume v=new Volume(a,b,c);
        System.out.println(v.peri());
        System.out.println(v.vol());
    }
}