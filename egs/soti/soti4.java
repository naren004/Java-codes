import java.util.*;
public class soti4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        String la=sc.next();
        String lab;
        if (la.equals("L1")){
            lab=(y<z) ?"L2":"L3";
        }
        else if (la.equals("L2")){
            lab=(x<z)?"L1":"L3";
        }
        else{
            lab=(x<y)?"L1":"L2";
        }
        System.out.println(lab);
        }
}