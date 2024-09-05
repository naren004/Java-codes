import java.util.Scanner;

import javax.print.FlavorException;

public class distance {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        Float x1=sc.nextFloat();
        Float y1=sc.nextFloat();
        Float x2=sc.nextFloat();
        Float y2=sc.nextFloat();
        Float x3=sc.nextFloat();
        Float y3=sc.nextFloat();

        Float val1 = (float) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        Float val2 = (float) Math.sqrt(Math.pow(x3-x1,2) + Math.pow(y3-y1,2));
        Float val3 = (float) Math.sqrt(Math.pow(x3-x2,2) + Math.pow(y3-y2,2));

        System.out.println(val1+val2+val3);


    }
}
