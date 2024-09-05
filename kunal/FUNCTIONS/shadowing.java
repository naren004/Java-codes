public class shadowing {
    static int x=9999;
    public static void main(String[] args) {
        System.out.println(x);
        int x=10;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x); 
        
    }
}