public class plain {
    public static void main(String[] args) {
        int n=1817;
        int sum=0;
        int temp=n;
        while (n>0) {
            int dig=n%10;
            sum =(sum*10)+dig;
            n /=10;
        }
        if(sum == temp){
            System.out.println("crt");
        }
        else{
            System.out.println("not");
        }
    }
}